package com.sammyhass;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        int coPrime = 0;
        int total = 10000;
        int[] factors1 = new int[total/2];
        int[] factors2 = new int[total/2];
        int counter = 0;
        for (int i = 0; i < total+1; i++) {
            int r1 = new Random().nextInt(total) + 5;
            int r2 = new Random().nextInt(total) + 5;
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
            for (int aFactors1 : factors1) {
                for (int aFactors2 : factors2) {
                    if (aFactors1 == 0 && aFactors2 == 0) {
                        break;
                    }
                    if (aFactors1 == aFactors2) {
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
        double doubleCo = (double) coPrime/total;
        System.out.println(Math.sqrt(6/doubleCo));


    }
}

