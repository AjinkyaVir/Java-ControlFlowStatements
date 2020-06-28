package com.company.whileloop;

public class Main {
    public static void main(String[] args) {

        int count = 1;
        while (count !=6){
            System.out.println("Count value is : " + count);
            count++;
        }

        System.out.println("*********************************\n");
        count = 1;
        while (true){
            if (count == 6){
                break;
            }
            System.out.println("Count value is : " + count);
            count++;
        }

    }
}
