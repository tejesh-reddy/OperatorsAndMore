package com.tcodes;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        VampireNumberGenerator vampireNumberGenerator = new VampireNumberGenerator();
        vampireNumberGenerator.printVampireNumbers(100);

        /* Experimenting */
        Experiment[] experiments = new Experiment[10];
        // Result: Initialization messages aren't printed, as expected as objects haven't been created.

        // Final part: Initialization messages are printed here
        for (int i = 0; i < experiments.length; i++) {
            experiments[i] = new Experiment("Experiment number " + i);
        }

    }
}
