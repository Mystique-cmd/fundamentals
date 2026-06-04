#include <stdio.h>
#include <stdbool.h>

static int handshake_state = 0;

/*States:
0 = IDLE (waiting for SYN)
1 = SYN_RCVD (waiting for ACK)
2 = ESTABLISHED */

/*Messages:
inputByte == 1 -> SYN
inputByte == 2 -> ACK */

bool simpleHandshake(unsigned char inputByte) {
    switch (handshake_state) {
        case 0: 
            if (inputByte == 1) {
                handshake_state = 1; 
            }
            break;

        case 1: 
            if (inputByte == 2) {
                handshake_state = 2; 
            }
            break;

        case 2: 
            // Remain established; ignore further input.
            break;

        default:
            handshake_state = 0;
            break;
    }

    return handshake_state == 2;
}

