class LinearS{
	public void LinearSearch(String arr[], String x){  //method which executes the linear search algorithm
       for(int i=0; i<arr.length; i++){
          if(arr[i] == x){
            System.out.println("String  "+x+ " found at index "+i);
            break;
          }
          else{
             continue;
          }
       }
	}

}

class Task1{
   public static void main(String args[]){
	  System.out.println("Applying linear search algorithm to a string of arrays"); 
	  String array[] = {"muntaha","rohat", "fatima", "unsa", "alwaaz", "aliza", "habiba","anshrah" }; //decleration and initilization of array
      String locate = "aliza";
      LinearS ls = new LinearS();
      ls.LinearSearch(array, locate);
      

	}
}
