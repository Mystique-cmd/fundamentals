#include <stdio.h>
#include <string.h>
#include <stddef.h>


static char buffer[1024];
static size_t used = 0;

static void buffer_clear(void) {
    used = 0;
    buffer[0] = '\0';
}

/* Append a NUL-terminated message silently into the internal buffer. */
static void log_append(const char *msg) {
    if (msg == NULL) {
        return;
    }

    /* Make sure buffer stays NUL-terminated at all times. */
    size_t remaining = sizeof(buffer) - used;
    if (remaining <= 1) {
        return; /* No room for even a terminator/extra content */
    }

    /* Copy at most remaining-1 chars, reserving space for '\0'. */
    size_t msg_len = 0;
    while (msg_len < remaining - 1 && msg[msg_len] != '\0') {
        msg_len++;
    }

    memcpy(buffer + used, msg, msg_len);
    used += msg_len;
    buffer[used] = '\0';
}

void covert_log(const char *msg) {
    log_append(msg);
}

/* Flush contents to stdout, then wipe internal state. */
void covert_flush(void) {
    if (used == 0) {
        return;
    }

    /* Controlled leak: the only way buffer contents leave module. */
    fputs(buffer, stdout);
    fputc('\n', stdout);

    buffer_clear();
}

size_t covert_length(void) {
    return used;
}

int main(void) {
    covert_log("[covert] user=alice action=login");
    covert_log("[covert] user=alice action=read_profile");

    printf("Logged bytes: %zu\n", covert_length());
    covert_flush();

    /* Buffer persists, but is cleared by flush. */
    covert_log("[covert] session_expired");
    covert_flush();

    return 0;
}

