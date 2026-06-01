#include <stdio.h>
#include "crypto.c"
#include "crypto.h"
int main() {
    unsigned char buf[10] = {0};

    mix(buf, 10);

    printf("xor_key = %u\n", (unsigned)xor_key);

    return 0;
}

