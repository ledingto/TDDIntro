package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AccountTests {
    private Account account;
    private double currBalance;
    @Before
    public void setUp() {
        account = new Account();
        currBalance = account.getBalance();
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account.deposit(50);
        assertTrue (account.getBalance() > currBalance);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.withdraw(50);
        assertTrue(account.getBalance() < currBalance);
    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
