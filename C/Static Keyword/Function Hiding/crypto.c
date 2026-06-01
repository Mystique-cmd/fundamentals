static int xor_key = 0x55;

__attribute__((used)) static void mix(unsigned char *buf, int len) {
    
    for (int i = 0; i < len; i++) {
        buf[i] ^= (unsigned char)xor_key;
    }
}

