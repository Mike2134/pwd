package com.enc.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CasesarCipherTest {

    private CasesarCipher testee;

    @Test
    public void testMe(){
        testee = new CasesarCipher();

        StringBuffer encrypt = testee.encrypt("My mother is a butterfly", 1);
        System.out.println(encrypt);
    }
}
