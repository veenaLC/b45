package com.cg.framework;

public abstract class BankFactory {
	public abstract SavingAcc getNewPrimeAccount(int accNo, String accNm, float accBal,boolean isSalary);
	public abstract CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal,float criditLimit);

}
