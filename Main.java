/*
* Figure our amount of logs that can
*   be stored for a specific log size
*
* @author  Daniel
* @version 1.0
* @since   2022-09-14
*/

import java.util.Scanner;

/**
* Program calculates log length.
*/
final class Main {

    /**
    * Prevent instantiation.
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Program calculates log length.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // Defining variables
        final Scanner s = new Scanner(System.in);
        final double[][] log = {
            {1, 0.25},
            {2, 0.5},
            {3, 1},
        };

        // Getting user input
        System.out.print("Select a log size [0]0.25m, [1]0.5mm, [2]1m: ");
        final int logSize = s.nextInt();

        // Calculations
        final double logWeight = 20 * log[logSize][1];
        final float logs = 1100 / (float) logWeight;

        // Output
        System.out.println(logs + " logs would fit if the size was "
            + log[logSize][1] + "m");

        System.out.println("\nDone");
    }
}
