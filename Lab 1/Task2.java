//Question no 2 lab 1

import java.util.Scanner;

class Area{

 int length; //creating an instance variable for length
 int breadth; //creating an instance variable for breadth

 //Transferring inputted values to the area class and method
 public void getDim(int a, int b){
   this.length = a;
   this.breadth = b;
 }
  
  //calculating area and hence returning it
 public int getArea(){
   int A = length * breadth;
   return A;
 }


	
}

class Test{
	public static void main(String args[]){
     
     int x; //input variable for length
     int y; //input variable for breadth
     Scanner sc = new Scanner(System.in);  //using this for input 
     System.out.print("Input the length of your rectangle : ");
     x = sc.nextInt(); //inputting length
     System.out.println();
     System.out.println("Input the breadth of your rectangle : ");
     y = sc.nextInt();   ///inputting breadth
     System.out.println();

     Area a = new Area(); //object of area class
     a.getDim(x,y); //passing inputted values to function
     

     System.out.println("Area of your rectangle is : " +a.getArea());  //printing out area by calling function which calculates and returns the value of area



	}
}