package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    int part1;
        int part2;
        int part3;
        int part4;
        part1 = number/1000;
        part2 = number%1000/100;
        part3 = number%100/10;
        part4 = number%10;
        if (part1 + part2 == part3 + part4) {
            System.out.println("The ticket with number " + number + " is 'lucky'");
        }else {
            System.out.println("You're not lucky");
        }
    }
}
