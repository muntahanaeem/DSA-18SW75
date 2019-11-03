class ArrAverage{        
    public float average(int []arr){        //method for calculating average of arrage and returning it
        float sum=0;  // the sum variable
        for(int i=0;i<arr.length;i++){   
            sum+=arr[i];  //adds every element to sum variable
        }
        return (sum/arr.length); //returns the average of array
    }
}

class Task4{
   public static void main(String[]args)
    {
        ArrAverage array1 = new ArrAverage();  //Creating  object of ArrayAverage class
        int []a = {12,3,19,4,5};      //Creating array
        System.out.print("Average= "+array1.average(a));   //Printing the average of array      
    }
	
}