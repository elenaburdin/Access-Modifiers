package com.company;

public class Main {
    public static void main(String[] args) {
        Account lenasAccount = new Account("Lena");
        lenasAccount.deposit(1000);
        lenasAccount.withdraw(500);
        lenasAccount.withdraw(-200);
        lenasAccount.deposit(-20);
        lenasAccount.calculateBalance();


        System.out.println("Balance on account is " + lenasAccount.getBalance());
        lenasAccount.calculateBalance();

    }
}