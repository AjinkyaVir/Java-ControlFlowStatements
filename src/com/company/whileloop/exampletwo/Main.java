package com.company.whileloop.exampletwo;

public class Main {

    public static void main(String[] args) {

        isEvenNumber(9);

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        int sum = 0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            count++;
            if (count == 6){
                break;
            }
            sum += number;
            System.out.println("Even number is : " + number);
        }
        System.out.println(sum);
    }

    private static boolean isEvenNumber(int number) {
        if (number % 2 == 0){
            return true;
        }
        return false;
    }

}
