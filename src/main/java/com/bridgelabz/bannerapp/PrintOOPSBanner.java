package com.bridgelabz.bannerapp;

/**
 * UC3: Print OOPS Banner
 * This program prints the word "OOPS" in a banner style using asterisks (*).
 * The class extend the functionality of UC2 by formatting the output in a banner style.
 * It uses String.join() method to concatenate strings with spaces for better readability.
 * which can lead to improved performance in scenarios with multiple string concatenations.
 * overcomes the inefficiencies of using the '+' operator for string concatenation in loops or multiple statements.
 * which can lead to improved performance in scenarios with multiple string concatenations.
 * creation of multiple immutable String objects, which can be inefficient in terms of memory and performance.
 *
 *
 * @author Bridgelabz
 * @version 3.0
 */

public class PrintOOPSBanner {

    public static void main(String[] args) {

        System.out.println(String.join(" ","   ***   ","    ***    ","******   ","  ****** "));
        System.out.println(String.join(" "," **   ** ","  **   **  ","**    ** ","**       "));
        System.out.println(String.join(" ","**     **"," **     ** ","**    ** ","**       "));
        System.out.println(String.join(" ","**     **"," **     ** ","*******  ","******* "));
        System.out.println(String.join(" ","**     **"," **     ** ","**       ","       **"));
        System.out.println(String.join(" "," **   ** ","  **   **  ","**       ","       **"));
        System.out.println(String.join(" ","   ***   ","    ***    ","**       "," ******* "));
    }
}