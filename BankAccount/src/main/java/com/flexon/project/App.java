package com.flexon.project;

import java.util.Scanner;

class Account{
    protected String customerName;
    protected String emailAddress;
    protected String phoneNumber;

    public Account(){
        this.customerName = "Samuel Yang";
        this.emailAddress = "willow0117@gmail.com";
        this.phoneNumber = "949-293-6877";
    }

    public void setName(String s){
        this.customerName = s;
    }
    public void setEmail(String s){
        this.emailAddress = s;
    }
    public void setPhoneNumber(String s){
        this.phoneNumber = s;
    }
    public String getName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.emailAddress;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

}
class BankAccount extends Account{

    private int accountNumber;
    private double balance;


    public BankAccount(){
        this.accountNumber = 123456789;
        this.balance = 50.0;
        this.customerName = super.customerName;
        this.emailAddress = super.emailAddress;
        this.phoneNumber = super.phoneNumber;
    }

    public void setBalance(double new_balance){
        this.balance = new_balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }

    public void deposite(double money){
        System.out.println(String.valueOf(money));
        setBalance(this.balance + money);
        System.out.println("Desposite Successfully");
    }

    public void withdraw(double money){
        double  new_balance = this.balance - money;
        if (new_balance >= 0) {
            setBalance(new_balance);
            System.out.println("Withdraw Successfully");
        }
        else{
            System.out.println("Insufficient Balance, Balance: " + String.valueOf(this.balance) +
                    " Customer Name: " + this.customerName);
        }
    }
    public void printAll(){
        System.out.println("Account Number: " + String.valueOf(this.accountNumber));
        System.out.println("Balance: " + String.valueOf(this.balance));
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Email Address: " + this.emailAddress);
        System.out.println("Phone Number: " + this.phoneNumber);

    }
}

public class App 
{
    public static void main( String[] args )
    {
        BankAccount bank_account = new BankAccount();
        while (true) {
            Scanner myObj = new Scanner(System.in);

            System.out.println("Show Balance: press 1\nDeposite: press 2\nWithdraw: press 3\nExit: press others");
            String option = myObj.nextLine();
            if (option.equals("1")) {

                bank_account.printAll();
                System.out.println("\n");

            } else if (option.equals("2")) {
                //Deposite
                System.out.println("\nPlease enter the amount: ");
                Scanner myObj2 = new Scanner(System.in);
                double desposite_balance = myObj2.nextDouble();
                bank_account.deposite(desposite_balance);

            } else if (option.equals("3")) {
                //Withdraw
                System.out.println("\nPlease enter the amount: ");
                Scanner myObj3 = new Scanner(System.in);
                double withdraw_balance = myObj3.nextDouble();
                bank_account.withdraw(withdraw_balance);

            } else {
                System.out.println("\nProgram Exits. ");
                return;
            }
        }

    }
}
