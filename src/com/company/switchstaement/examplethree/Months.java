package com.company.switchstaement.examplethree;

public class Months {
    public static void main(String[] args) {
        String months = "January";
        switch (months.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
    }
}
