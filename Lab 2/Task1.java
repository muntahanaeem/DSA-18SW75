import java.util.Random; //importing the random class

class Task1{
	public static void main(String args[]){
      int arr[] = new int[100];  //an array of size 100
      Random r = new Random();   //object of random class

      for(int i=0; i<arr.length; i++){ //for loop to generate random numbers
        arr[i] = r.nextInt();  
      }

      for(int i =0; i<arr.length; i++){ //printing out the randomly populated array
      	System.out.print(arr[i]);
      }

	}
}