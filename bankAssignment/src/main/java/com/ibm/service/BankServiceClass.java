package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ibm.bean.Bank;
import com.ibm.dao.BankDaoClass;
import com.ibm.dao.BankDaoInterface;

@Component("service")
public class BankServiceClass implements BankServiceInterface {

	@Autowired
	BankDaoClass dao;
	

	public void connectToDb() {
		dao.connectToDb();
	}

	@Override
	public boolean createAccount(Bank bank) {
		return dao.createAccount(bank);
	}

	@Override
	public boolean displayLowBalance(Bank bank) {
		return dao.displayLowBalance(bank);
	}

	@Override
	public boolean deposit(Bank bank) {
		return dao.deposit(bank);
	}

	@Override
	public boolean withdraw(Bank bank) {
		return dao.withdraw(bank);
	}

	@Override
	public boolean moneyTransfer(Bank bank) {
		return dao.moneyTransfer(bank);
	}

	@Override
	public Bank printTransaction(Bank bank) {
		return dao.printTransaction(bank);
	}

}
