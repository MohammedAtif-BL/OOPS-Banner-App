package com.bridgelabz.bannerapp;

/**
 * UC6: Render OOPS Banner using Pattern Programming
 *
 * This use case extends UC5 by implementing a method to print the "OOPS" banner
 * using pattern programming. Each letter is represented by a specific pattern of
 * asterisks and spaces. This enhances code readability and modularity by separating
 * the pattern definitions into individual methods.
 *
 * @author Bridgelabz
 * @version 6.0
 */

public class PrintOOPSBanner {

    public static String[] getOPattern() {
        return new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
    }


    public static String[] getPPattern() {
        return new String[]{
                "******   ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };
    }


    public static String[] getSPattern() {
        return new String[]{
                "  ****** ",
                "**       ",
                "**       ",
                " ******* ",
                "       **",
                "       **",
                " ******  "
        };
    }


    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();


        for (int i = 0; i < 7; i++) {
            System.out.println(oPattern[i]+" "+oPattern[i]+" "+pPattern[i]+" "+sPattern[i]);
        }
    }
}