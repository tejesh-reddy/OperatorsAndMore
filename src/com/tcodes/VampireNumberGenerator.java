package com.tcodes;

import java.util.Arrays;

public class VampireNumberGenerator {
    public void printVampireNumbers(int count)
    {
        String[] str1, str2;
        int product, sum = 0;
        for(int i = 10; i < 1000; i++) {
            for(int j = 10; j < 1000; j++) {
                if(sum >= count)
                    return;
                product = i * j;
                str1 = String.valueOf(product).split("");
                str2 = (String.valueOf(i) + j).split("");
                Arrays.sort(str1);
                Arrays.sort(str2);
                if(Arrays.equals(str1, str2)) {
                    sum++;
                    System.out.println(" "+ sum + ". vampire number: " + product);
                }
            }
        }
    }
}
