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
        int select;

        Account user1=new Account(name, surname);


        do {
            System.out.println("What do You want to do?\n1. Account details\n2. Deposit\n3. Withdraw\n4. Exit");
            select=sc.nextInt();

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
                System.out.println("How much money do You want to withdraw?");
                int withdraw=sc.nextInt();
                if(user1.getBalance()>=withdraw){
                    user1.withdraw(withdraw);
                    System.out.println("Your current balance is: " + user1.getBalance());
                }
                else {
                    System.out.println("We can't do this operation, your account balance is lower than amount You want to withdraw.");
                }
                break;
            case 4:
                System.out.println("Exit program.");
        }
    }
        while (select!=4);
}}