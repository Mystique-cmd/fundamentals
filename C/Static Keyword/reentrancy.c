#include <stdio.h>
#include <ctype.h>
#include <stdbool.h>

bool parse_string_incremental(const char *input) {
    static size_t pos = 0;          

    if (input == NULL) {
        pos = 0;
        return false;
    }

    char c = input[pos];
    if (c == '\0') {
        pos = 0;                    
        return false;
    }

    pos++;
    return true;
}

int main(void) {
    char input[6];

    printf("Enter a 5 character string: ");
    if (scanf("%5s", input) != 1) {
        return 1;
    }

    int ch;
    while (parse_string_incremental(input)) {
        putchar(ch);
    }
    return 0;
}

