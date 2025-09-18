package com.wipro.bank.acc;

public class RDAccount extends Account {
    public RDAccount(int tenure,float principal) {
    	this.tenure=tenure;
    	this.principal=principal;
    }

	@Override
	public float calculateAmountDeposit() {
		return tenure*principal*12;
	}
	
	@Override
	public float calculateInterest()
	{
		int n=4;
		int totalmonths=tenure * 12;
		float r=rateOfInterest/100;
		float compoundInterest=0.0f;
		for(int i=1;i<=totalmonths;i++)
		{  
			float t=(float)(totalmonths - i + 1)/12.0f;
			float amount=(float)(principal * (Math.pow((1+r/n),n*t)-1)); 
			compoundInterest += amount;
		}
		return compoundInterest;
	}

	
}
