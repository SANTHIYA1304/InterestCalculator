package com.wipro.bank.acc;

public abstract class Account {
     int tenure;
     float principal;
     float rateOfInterest;
     public void setInterest(int age,String gender) {
    	 if(gender.equals("Male")&&age<60) {
		   this.rateOfInterest=9.8f;
		}
    	 if(gender.equals("Male")&&age>=60) {
  		   this.rateOfInterest=9.8f;
  		}
    	 if(gender.equals("Female")&&age<58) {
  		   this.rateOfInterest=9.8f;
  		}
    	 if(gender.equals("Female")&&age>=58) {
  		   this.rateOfInterest=9.8f;
  		}
     }
     public float calculateMaturityAmount(float totalPrincipalDeposit,float Maturity) {
    	 return totalPrincipalDeposit+Maturity;
     }
     public abstract float calculateInterest();
     public abstract float calculateAmountDeposit();
}
