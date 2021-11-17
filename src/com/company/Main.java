package com.company;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number){

        //To check that if time is greater than 2 it's not prime, because prime numbers are only divided by itself and 1.
        //For example: 2, 3, 5... etc are prime number,
        //but if you think other numbers like 15; There are 4 numbers that can divide it. They are 1, 3, 5, 15.

        int time = 0;

        if(number == 1 || number == 0){
            return false;
        }

        for(int i = 1; i <= number; i++){

            if(number % i == 0){
                time++;
            }

            if(time > 2){
                return false;
            }

        }

        return true;
    }

    public static void ShowPrimeNumbers(int number)
    {
        int amountOfPrimeNumber = 0;
        for(int i = 0; i < number; i++){
            if(isPrime(i)){
                System.out.println(i);
                amountOfPrimeNumber++;
            }
        }

        System.out.println("Amount of prime numbers on interval [0-" + number + "] -> " + amountOfPrimeNumber);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number to determine interval to show prime numbers in that interval: ");
        number = input.nextInt();

        ShowPrimeNumbers(number);
    }
}
