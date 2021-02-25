package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.ui.BankUI;

public class MyMain {

	public static void main(String[] args) {
ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
		BankUI bankClass = theContext.getBean("bankClass", BankUI.class);
			bankClass.menu();
		//System.out.println("Test");
	}

}
