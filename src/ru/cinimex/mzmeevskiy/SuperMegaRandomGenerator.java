package ru.cinimex.mzmeevskiy;

import java.security.SecureRandom;

public class SuperMegaRandomGenerator {

    public static String generateCharNumString(int len) {
        SecureRandom rand = new SecureRandom();
        StringBuilder buf = new StringBuilder(len);
        int num = 0;
        for (int i = 0; i < len; i++){
            num = rand.nextInt(62);
            if(num < 10) {
                buf.append((char) (num + 48));
            } else if (num < 36) {
                buf.append((char) (num + 55));
            } else {
                buf.append((char) (num + 61));
            }
        }

        return buf.toString();
    }

    public static String generateNumericString(int len) {
        SecureRandom rand = new SecureRandom();
        StringBuilder buf = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            buf.append((char)(rand.nextInt(10) + 48));
        }
        return buf.toString();
    }
}
