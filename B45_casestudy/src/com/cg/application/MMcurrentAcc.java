package com.cg.application;

import com.cg.framework.CurrentAcc;

public class MMcurrentAcc extends CurrentAcc {

	public MMcurrentAcc(int accNo, String accNm, float accBal, float criditLimit) {
		super(accNo, accNm, accBal, criditLimit);
		
	}
	public void withdraw(float criditLimit) {
		System.out.println("Dear current User, withdraw amount your account : "+getAccBal()+
				" and cridit limit is " +criditLimit );
		
	}
	@Override
	public String toString() {
		return "MMcurrentAcc [getCriditLimit()=" + getCriditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
