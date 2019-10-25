//Question no 1 lab 1

import java.util.Scanner; 


class Employee{   //Class handling all increments

   
  int salary;  //creating instance variables in class to store values and incremented salary values
  int nohours; //creating instance variables in class to store values and incremented work values  
    
    //Method to get the info entered by user to the class where the increments will happen
   public void getInfo(int a, int b){
    this.salary = a;
    this.nohours = b;

   }
     //Method to increment the salary is its less than 500
   public void AddSal(){
     if(salary <500){
      salary = salary +10;
     }
   }

    //increment due to no of hours
    
    public void AddWork(){

     if(nohours>6){
       salary = salary +5;
     }
 }
    

    //Printing out the final salary
    public void prt(){
    	
    	System.out.println("the new salary afyer all the necessary additions is : "+salary );
    }

}	

    

	


class Task1{


	public static void main(String args[]){

	int sal;
	int hours;

	Scanner sc = new Scanner(System.in);  //creating an object of scanner
	System.out.print("Input the salary of the Employee : ");
	sal = sc.nextInt(); //inputting salary 
	System.out.println();
	System.out.print("Input the no of hours worked by the employee : ");
    hours = sc.nextInt(); // inputting work hours
    System.out.println();

    Employee e1 = new Employee(); //creating an object of employee class
    e1.getInfo(sal, hours);  //passing two arguments(input ones)to the method getInfo
    e1.AddSal();   //calling addsal method
    e1.AddWork();   //calling addwork method
    e1.prt();   //calling print method

    }


}