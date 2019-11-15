package com.company.partA;

import java.util.Scanner;

class customer {
    String customerName;
    long accountNumber;
    double balance;

    customer(String s, long a)
    {
        customerName = s;
        accountNumber = a;
        balance = 0;
    }

    void display() {
        System.out.println("Name:" + customerName + "Accno:" + accountNumber + "Balance=" + balance);
    }
}

class account extends customer {
    String acc_type;
    double interest_rate;

    account(String s, long accountNumber, String at) {
        super(s, accountNumber);
        acc_type = at;
    }

    void deposit(double depAmount) {
        balance += depAmount;
    }

    void withdraw(double withAmount) {
        if (balance < withAmount)
            System.out.println("Insufficient balance");
        else
            balance -= withAmount;
    }

    double getbalance() {
        return (balance);
    }

    void display() {
        super.display();
        System.out.println("Account_Type:" + acc_type);
    }
}

class Bank {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the name of the customer : ");
        String name = read.nextLine();

        System.out.println("Enter the account number : ");
        long accno = read.nextInt();

        System.out.println("Enter the account type :");
        String acc_type = read.nextLine();

        account ac = new account(name, accno, acc_type);

        while (flag) {
            System.out.println("1.Deposit\n2.Withdraw\n3.Check balance\n4.Display\n");
            System.out.println("Enter your choice");
            int choice = read.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Amount :");
                    double depAmount = read.nextDouble();
                    ac.deposit(depAmount);
                    break;
                case 2:
                    System.out.println("Withdrawal amount : ");
                    double withAmount = read.nextDouble();
                    ac.withdraw(withAmount);
                    break;
                case 3:
                    double bal = ac.getbalance();
                    System.out.println("Balance:" + bal);
                    break;
                case 4:
                    ac.display();
                    break;
                case 5:
                    flag = false;
            }
        }
        read.close();
     }
}
