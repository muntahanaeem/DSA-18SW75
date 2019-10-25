//Question 3 lab 1

import java.util.Scanner;

class Area{

  int length; //creating an instance variable for length
  int breadth; //creating an instance variable for breadth

  Area(int l, int b){ //creating a constructor for class area and passing inutted values to it
  this.length = l; //initilizing inputted value to the instance variable
  this.breadth = b; //initilizing inputted value to the instance variable

    System.out.print("The area of your rectangle is "+returnArea()); //printing area and calling returnarea method which holds and calculates value of area
  }

  public int returnArea(){  //method to calculate and return area
    int a = length *breadth;
    return a;
  }
	
}

class Run1{

   public static void main(String args[]){
	int x;  //variables where input value for length is stored
	int y;  //variable where input value for breadth is stored

	Scanner sc = new Scanner(System.in);  //using scanner class to input
	System.out.print("Input the length of your rectangle : ");
	x = sc.nextInt();  //inputting length
	System.out.println();
	System.out.print("Input tht breadth of your rectangle : ");
	y = sc.nextInt();  //inputting breadth
	System.out.println();

	Area a = new Area(x,y); //object of class and passing values to constructor



 }
}