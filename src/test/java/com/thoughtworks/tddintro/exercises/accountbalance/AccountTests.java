package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(100);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account.deposit(50);
        assertThat(account.getBalance(), is(150.0));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.withdraw(50);
        assertThat(account.getBalance(), is(50.0));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account = new Account(50);
        account.withdraw(100);
        assertThat(account.getBalance(), is(50.0));
    }
}
