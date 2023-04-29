package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float criditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal,float criditLimit) {
		super(accNo, accNm, accBal);
		this.criditLimit = criditLimit;
		
	}

	public float getCriditLimit() {
		return criditLimit;
	}
	public void withdraw(float criditLimit) {
		System.out.println("criditLimit is: "+criditLimit);
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [criditLimit=" + criditLimit + ", getCriditLimit()=" + getCriditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
	

}
