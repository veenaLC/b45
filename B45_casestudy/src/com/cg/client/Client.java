package com.cg.client;

import com.cg.application.MMcurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.application.MMBankFactory;
import com.cg.framework.SavingAcc;
import com.cg.framework.CurrentAcc;
import com.cg.framework.BankFactory;

public class Client {
	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(123788,"veena",1000,true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		CurrentAcc na=new MMcurrentAcc(52387999,"lakshmi",2000,700000000);
		na.withdraw(na.getCriditLimit());
		na.toString();
	}

}
