package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
   public boolean ValidateData(float principal, int tenure,int age, String gender) {
	   if((principal>=500)&&(tenure==5||tenure==10)&&(age>1&&age<100)&&(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female"))) {
		   return true;
	   }
	   else {
		   try {
			   throw new BankValidationException();
		   }
		   catch(BankValidationException e)
		   { 
			   System.out.println(e);
	   }
		   return false;
   }
}
   public void calculate(float principal,int tenure,int age,String gender) {
	   if(ValidateData(principal,tenure,age,gender)) {
		   RDAccount r = new RDAccount(tenure, principal);
           r.setInterest(age, gender);
		   System.out.println(r.calculateInterest());
		   System.out.println(r.calculateAmountDeposit());
		   System.out.println(r.calculateMaturityAmount(1000, 19));
	   }
	   
   }
   


}
