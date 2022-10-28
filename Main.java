package com.arithmeticoperations;

public class Main {
    public static void main(String[] args) {
        byte a = 34;
        byte b = 12;

        System.out.println(a + b);

        byte c = 5;
        byte d = 4;

        System.out.println(c*d);

        char q  = 64;

        System.out.println(q);

        int e = 39;
        int f = 4;
        double g = (double) e / f;

        System.out.println(g);

        int h = 349;
        int i = 243;
        int j = (h + i);
        int k = --j;

        System.out.println(k);

        double l = (double) a + b + c + d + g + k;

        System.out.println(l);
    }
}
