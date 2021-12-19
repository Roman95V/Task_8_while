package com.company;

public class Main {

    public static void main(String[] args) {
	    int counter = 1;
        System.out.println("Input of odd numbers: ");
        while (counter < 100){
           if(counter % 2 != 0)
           System.out.println(counter);
           counter++;
        }
    }
}
