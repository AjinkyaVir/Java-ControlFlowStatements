package com.company.switchstaement.exampleone;

public class Demo {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");

            default:
                System.out.println("Value was not 1,2 0r 3");
                break;
        }
    }
}
