package com.enc.util;

import javax.crypto.Cipher;

// Encrypts text using a shift od s
public class CasesarCipher implements Cipher {

    public StringBuffer encrypt(final String text, int s) {
        final StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            final int rawCharPos = text.charAt(i);

            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) ((rawCharPos + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) ((rawCharPos + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
}