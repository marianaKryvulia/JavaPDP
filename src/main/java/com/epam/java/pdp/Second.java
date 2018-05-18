package com.epam.java.pdp;
/**
 *
 * @param args
 */
import java.util.Random;

public class Second {
    static String builderStr;

    public static void main (String[] args) {
        int a = 3;
        for (int i = 0; i < a; i++) {
//            Random r = new Random(a);
//            StringBuilder sb = new StringBuilder();
//            int n;
//            while ((n = r.nextInt(27)) > 0) sb.append((char)('`' + n));
//            System.out.println(sb);
            String generated = generateString(10);
            System.out.println(generated);
        }
    }
    private static final String charactersToGenerate = "abcdefghijklmnopqrstuvwxyz";

    public static String generateString(int length) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            builder.append(charactersToGenerate.charAt(random.nextInt(charactersToGenerate.length())));
        }
        return builder.toString();
    }
}
