package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome in our Bank!");
        System.out.println("If You want to create an account please enter Your name: ");
        String name=sc.next();
        System.out.println("Please enter Your surname: ");
        String surname=sc.next();

        Account user1=new Account(name, surname);

        System.out.println("What do You want to do?\n1. Account details\n2. Deposit\n3. Withdraw");
        int select=sc.nextInt();
        switch(select){
            case 1:
                System.out.println("User details");
                System.out.println(user1.details());
                break;
            case 2:
                System.out.println("Deposit money");
                System.out.println("How much money do You want to deposit?");
                int deposit=sc.nextInt();
                user1.deposit(deposit);
                System.out.println("Your current balance is: " + user1.getBalance());
                break;
            case 3:
                System.out.println("Withdraw");
                break;
        }
    }
}