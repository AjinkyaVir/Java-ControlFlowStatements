package com.company.forloopstatement.exampleone;

public class Main {
    public static void main(String[] args) {

        /* Using the for statement, call the calculateInterest method with
        * the amount of 10000 with an Interest Rate 2,3,4,5,6,7 and 8
        * and print the result to the control window.
        * */

        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest rate " + String.format("%.2f",calculateIntrest(10000.0,i)));
        }

        System.out.println("********************************************");

        /* how would you modify the for loop above to the same thing as
        shown but to start from 8% and work back to 2%
        * */
        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest rate " + String.format("%.2f",calculateIntrest(10000.0,i)));
        }

        int count = 0;
        for (int i=10; i<50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if (count == 10){
                    System.out.println("Exit for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        //for (int i=2; i<=(long)Math.sqrt(n); i++)
        for (int i=2; i<=n/2; i++){
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }

    private static double calculateIntrest(double amount,double interestRate) {
        return (amount * (interestRate / 100));
    }
}
