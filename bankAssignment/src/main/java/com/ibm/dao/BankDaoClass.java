package com.ibm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.ibm.bean.Bank;

@Component("dao")
public class BankDaoClass implements BankDaoInterface {
	Connection dbCon;
	PreparedStatement preparedStatement;
	String queryToExecute;

	public void connectToDb() {
		String urlToConnect = "jdbc:mysql://localhost:3306/deepthi";

//    	Declare the Username and Password of the DB to connect
		String userName = "root";

		String userPassword = "";

		try {
//    	     #1 Load the DB Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			#2 Try establishing the connection
			dbCon = DriverManager.getConnection(urlToConnect, userName, userPassword);

		} catch (ClassNotFoundException e) {
			System.out.println("Can't load the Driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Can't connect to db : " + e.getMessage());
		}
	}

	@Override
	public boolean createAccount(Bank bank) {
		queryToExecute = "insert into bank(number, name) values (?,?)";
		try {
//        	Get a reference to the PreparedStatement object
			preparedStatement = dbCon.prepareStatement(queryToExecute);

//			Replace the values for ?
			preparedStatement.setString(1, bank.getNumber());
			preparedStatement.setString(2, bank.getName());

//			Execute the query
			return preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			System.out.println("Can't get the PreparedStatement object : " + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean displayLowBalance(Bank bank) {
		queryToExecute = "select * from bank";
		try {
//        	Get a reference to the PreparedStatement object
			preparedStatement = dbCon.prepareStatement(queryToExecute);
			ResultSet resultSet = preparedStatement.executeQuery(queryToExecute);
			while (resultSet.next()) {
				if (resultSet.getString("Number").trim().equals(bank.getNumber().trim()) || (resultSet.getInt("Bank ID")==bank.getBankID())) {
					if (resultSet.getInt("Balance") <= 100)
						return true;
					else
						return false;
				}
			}

		} catch (SQLException e) {
			System.out.println("Can't get the PreparedStatement object : " + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean deposit(Bank bank) {
		queryToExecute = "select * from bank";
		try {
//        	Get a reference to the PreparedStatement object
			preparedStatement = dbCon.prepareStatement(queryToExecute, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet = preparedStatement.executeQuery(queryToExecute);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
				if (resultSet.getString("Number").trim().equals(bank.getNumber().trim())) {
					bank.setBalance((resultSet.getInt(4) + bank.getDepositAmount()));
					resultSet.updateInt(4, bank.getBalance());
					resultSet.updateString(5, resultSet.getString(5)+" , Amount Deposited : Rs."+bank.getDepositAmount()+", New Balance: Rs." +bank.getBalance()+"|");
					resultSet.updateRow();
			
					return true;
			}
			}
		} catch (SQLException e) {
			System.out.println("Can't get the PreparedStatement object : " + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean withdraw(Bank bank) {
		queryToExecute = "select * from bank";
		try {
//        	Get a reference to the PreparedStatement object
			preparedStatement = dbCon.prepareStatement(queryToExecute, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
			ResultSet resultSet = preparedStatement.executeQuery(queryToExecute);
			while (resultSet.next()) {
				if (resultSet.getString("Number").trim().equals(bank.getNumber().trim()) ){
				if((resultSet.getInt(4) - bank.getWithdrawAmount())>0) {
					bank.setBalance((resultSet.getInt(4) - bank.getWithdrawAmount()));
					resultSet.updateInt(4, bank.getBalance());
					resultSet.updateString(5, resultSet.getString(5)+" , Amount Withdrawn : Rs."+bank.getWithdrawAmount()+", New Balance: Rs." +bank.getBalance()+"|");
					resultSet.updateRow();
					return true;
				} else
					System.out.println("Insufficient Balance");
				}
			}
		} catch (SQLException e) {
			System.out.println("Can't get the PreparedStatement object : " + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean moneyTransfer(Bank bank) {
		boolean flag= false;
		queryToExecute = "select * from bank";
		try {
//        	Get a reference to the PreparedStatement object
			preparedStatement = dbCon.prepareStatement(queryToExecute, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet = preparedStatement.executeQuery(queryToExecute);
			while (resultSet.next()) {
				if (resultSet.getString("Number").trim().equals(bank.getNumber().trim())) {
					if((resultSet.getInt(4) - bank.getWithdrawAmount())>=0) {
					bank.setBalance((resultSet.getInt(4) - bank.getWithdrawAmount()));
					resultSet.updateInt(4, bank.getBalance());
					resultSet.updateString(5, resultSet.getString(5)+" , Amount Withdrawn : Rs."+bank.getWithdrawAmount()+", New Balance: Rs." +bank.getBalance()+"|");
					resultSet.updateRow();
					flag= true;
				
				}
			}
			}
				resultSet = preparedStatement.executeQuery(queryToExecute);
				while(resultSet.next()) {
					if (resultSet.getString("Number").trim().equals(bank.getTonumber().trim())&& flag) {
						bank.setBalance((resultSet.getInt(4) + bank.getWithdrawAmount()));
						resultSet.updateInt(4, bank.getBalance());
						resultSet.updateString(5, resultSet.getString(5)+" , Amount Deposited : Rs."+bank.getWithdrawAmount()+", New Balance: Rs." +bank.getBalance()+"|");
						resultSet.updateRow();
						return flag;
					}
			}
		}catch (SQLException e) {
				System.out.println("Can't get the PreparedStatement object : " + e.getMessage());
			}
		return false;
	}

	@Override
	public Bank printTransaction(Bank bank) {
		queryToExecute = "select * from bank";
		try {
//        	Get a reference to the PreparedStatement object
			preparedStatement = dbCon.prepareStatement(queryToExecute);
			ResultSet resultSet = preparedStatement.executeQuery(queryToExecute);
			while (resultSet.next()) {
				if (resultSet.getString("Number").trim().equals(bank.getNumber().trim()) || (resultSet.getInt("Bank ID")==bank.getBankID())) {
					bank.setTransactions(resultSet.getString(5));
					return bank;
				}
			}
			}catch (SQLException e) {
				System.out.println("Can't get the PreparedStatement object : " + e.getMessage());
			}
		return bank;
	}

}
