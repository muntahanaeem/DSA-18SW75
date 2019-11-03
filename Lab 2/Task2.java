class Task2{
	public static void main(String args[]){

	 int arr1[]={3,5,6,2,8}; //creating two arrays which are exactly the same
	 int arr2[]={3,5,6,2,8};
    

     if(arr1.length == arr2.length){   //checking whether their length is the same
     	int eq = 0;                  //initilizing a counting variable to count each time elements of the array are equal
       for(int i = 0; i<arr1.length; i++){
         if(arr1[i]==arr2[i]){    //loop generated to check whether each element is equal
           eq++;               //if equal variable incremented
         }
       }

       if(eq == arr1.length){          //if equal variable is equal to length of array the same
        System.out.println("Arrays are the same");
       }

       else{      //equal variable not equal to length
        System.out.println("Arrays are not the same");
       }
     }

     else{          //arrays lengths are not equal
        System.out.println("Arrays are not the same");
     }

	}
}