package com.bridgelabz.bannerapp;

/**
 * UC4: Render OOPS Banner using Array and Enhanced For Loop
 *
 * This use case demonstrates how to create and display an OOPS banner
 * using an array to store each line of the banner and an enhanced for loop, eliminating
 * the need for manual spacing, improving code readability and maintainability.
 *
 * @author Bridgelabz
 * @version 4.0
 */

public class PrintOOPSBanner {

    public static void main(String[] args) {

        String[] bannerLines = new String[7];

        bannerLines[0] = String.join(" ","   ***   ","    ***    ","******   ","  ****** ");
        bannerLines[1] = String.join(" "," **   ** ","  **   **  ","**    ** ","**       ");
        bannerLines[2] = String.join(" ","**     **"," **     ** ","**    ** ","**       ");
        bannerLines[3] = String.join(" ","**     **"," **     ** ","*******  "," ******* ");
        bannerLines[4] = String.join(" ","**     **"," **     ** ","**       ","       **");
        bannerLines[5] = String.join(" "," **   ** ","  **   **  ","**       ","       **");
        bannerLines[6] = String.join(" ","   ***   ","    ***    ","**       "," ******* ");

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}