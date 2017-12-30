package com.sammyhass;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        int coPrime = 0;
        int[] factors1 = new int[5000];
        int[] factors2 = new int[5000];
        int counter = 0;
        for (int i = 0; i < 10000000; i++) {
            int r1 = new Random().nextInt(1000) + 5;
            int r2 = new Random().nextInt(1000) + 5;
            for (int j = 2; j < r1; j++) {
                if (r1 % j == 0) {
                    factors1[counter] = j;
                    counter++;
                }
            }
            counter = 0;
            for (int j = 2; j < r2; j++) {
                if (r2 % j == 0) {
                    factors2[counter] = j;
                    counter++;
                }
            }
            int coprimeCount = 0;
            for (int z = 0; z < factors1.length; z++) {
                for (int j = 0; j < factors2.length; j++) {
                    if (factors1[z] == 0 && factors2[j] == 0) {
                        break;
                    }
                    if (factors1[z] == factors2[j]) {
                        coprimeCount += 1;
                    }
                }
            }
            if (coprimeCount == 0) {
                coPrime += 1;
            }
            factors1 = new int[500];
            factors2 = new int[500];
        }
        double doubleCo = (double) coPrime/10000000;
        System.out.println(Math.sqrt(6/doubleCo));


    }
}

