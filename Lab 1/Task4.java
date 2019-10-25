//Question 4 lab 1

import java.util.Scanner;

class Account{
	
	//instance variable
	protected double balance;

	//methods
    //Desposit method
	public void Deposit(double amount){
     //abstract method, implementation not required
	}

	//Withdraw method
	public void withDraw(double amount){
	  //abstract method, implementation not required
	}
}

class SavingAccount extends Account{
	
	//instance variables
	private double defaultIntrestRate = 2.3;
	private double intrestRate;

	//methods
	 public void setDefaultIntrestRate(double inrate){
	  intrestRate = inrate;
	 }

	 public void applyLonthlyIntrest(){
	  //do not require implementation
     }
}

class Test1{
	public static void main(String args[]){

	  SavingAccount sa = new SavingAccount();

	}
}