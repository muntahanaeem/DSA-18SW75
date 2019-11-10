class LinearS{
	public void LinearSearch(char array[], char c){
	  for(int i=0; i<array.length; i++){
	   if(array[i]==c){
         System.out.println("Character  "+c+ " found at index "+i);
            break;
	   }
	   else{
	    continue;
	   }
	  }

	}
}

class Task3{
	public static void main(String args[]){
	 System.out.println("Applying linear search to a string of characters....");
	 char arr1[] = {'h', 'o', 's', 'p', 'i', 't', 'a', 'l'};
	 char a = 't';
	 System.out.println("locating t in a string of characters....");
	 LinearS ls = new LinearS();
	 ls.LinearSearch(arr1,a);
	}
}