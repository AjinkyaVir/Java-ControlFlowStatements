package com.company.switchstaement.exampletwo;

public class FindChar {

    /*
    *           // Create a new switch statement using char instead of int

                // create a new char variable

                // create a switch statement testing for

                // A, B, C, D, or E

                // display a message if any of these are found and then break

                // Add a default which displays a message saying not found
    *
    * */

    public static void main(String[] args) {
        char character = 'B';
        switch (character){
            case 'A':
                System.out.println("found A");
                break;
            case 'B':
                System.out.println("found B");
                break;
            case 'C':
                System.out.println("found C");
                break;
            case 'D':
                System.out.println("found D");
                break;
            case 'E':
                System.out.println("found E");
                break;
            default:
                System.out.println("Not found any");
        }
    }
}
