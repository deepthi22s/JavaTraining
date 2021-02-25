package com.ibm.service;

import com.ibm.bean.Bank;

public interface BankServiceInterface {
	 public boolean createAccount(Bank bank);
	 public boolean displayLowBalance(Bank bank);
	 public boolean deposit(Bank bank);
	 public boolean withdraw(Bank bank);
	 public boolean moneyTransfer(Bank bank);
	 public Bank printTransaction(Bank bank);
}
