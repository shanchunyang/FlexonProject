package com.flexon.project;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.BeforeClass;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    static BankAccount bank_account;

    @BeforeClass
    public static void setUpClass() {
        bank_account = new BankAccount();
    }

    @Test
    public void checkDeposite() throws Exception
    {
        //Default balance should be 50.0.
        assertTrue(bank_account.getBalance() == 50.0);

        bank_account.deposite(100);
        //After depositing 100.0, the balance should be 150.0
        assertTrue(bank_account.getBalance() == 150.0);

        bank_account.deposite(500);
        //After depositing 500.0, the balance should be 650.0
        assertTrue(bank_account.getBalance() == 650.0);
    }

    @Test
    public void checkDeposite_negative() throws Exception
    {
        bank_account = new BankAccount();
        bank_account.deposite(100);
        //After depositing 100.0, the balance should not be 300.0
        assertTrue(bank_account.getBalance() != 300.0);

        bank_account.deposite(500);
        //After depositing 500.0, the balance should not be 100.0
        assertTrue(bank_account.getBalance() != 100.0);
    }

    @Test
    public void checkWithdraw() throws Exception
    {
        bank_account = new BankAccount();
        bank_account.deposite(100);
        bank_account.withdraw(50);

        //After depositing 100.0 and withdrawing 50.0, the balance should be 100
        assertTrue(bank_account.getBalance() == 100.0);

        bank_account.withdraw(25);
        //After withrawing 25, the balance should be 75
        assertTrue(bank_account.getBalance() == 75);

        bank_account.withdraw(150);
        //After withrawing 150, since it is not enough, the balance will remain 75
        assertTrue(bank_account.getBalance() == 75);

    }

    @Test
    public void checkWithdraw_negative() throws Exception
    {
        bank_account = new BankAccount();
        bank_account.deposite(100);
        bank_account.withdraw(50);

        //After depositing 100.0 and withdrawing 50.0, the balance shouldn't be 25
        assertTrue(bank_account.getBalance() != 25.0);

        bank_account.withdraw(25);
        //After withrawing 25, the balance shouldn't be 200
        assertTrue(bank_account.getBalance() != 200);

        bank_account.withdraw(10000);
        //After withrawing 10000, the remain should still be greater than zero
        assertTrue(bank_account.getBalance() >= 0);

    }
}
