package com.chief;

import java.util.Scanner;

public class FizzBuzz {
public static void game(){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    if (num % 3 == 0 &&num % 5==0) {
        System.out.println("fizzbuzz");
    }else if (num% 3==0) {
        System.out.println("fizz");

    }else if (num % 5 == 0) {
        System.out.println("buzz");

    }else if (num%3==1){
        System.out.println(num);
    }else if(num%5==1){
        System.out.println(num);
    }else {
        System.out.println(" ");
    }


}
    public static void main(String[] args) {
        System.out.println("Welcome to fizzbuzz \n");
        int i;
    for (i=0;i<3;i++){
        if (i==3){
            System.out.println("Game over!!");
            break;
        }

        System.out.println("Enter a number: ");



        game();


    }  System.out.println("Game over!!");
}



}
