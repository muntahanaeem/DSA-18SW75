 import java.util.Arrays;
 class BinaryS{
   public void BinarySearch(char arr[], char value){

     Arrays.sort(arr);
        int p= 0;
        int q = arr.length-1;

       
       while(true){
        if(p>q){
            System.out.println("value does not exist");
            break;
        }
        else{
            int mid = (p+(q-p))/2;
            if(arr[mid] == value){
                System.out.println("String found at index"+mid);
                break;
            }
            else if(arr[mid]<value){
                p = mid+1;
            }
            else if(arr[mid]>value){
                q = mid-1;
            }
        }
       }

    }

  }
 

 
 class Task4{
  public static void main(String args[]){
    System.out.println("Applying binary search to a string of characters....");
	 char arr1[] = {'h', 'o', 's', 'p', 'i', 't', 'a', 'l'};
	
	 System.out.println("locating h in a string of characters....");
	 BinaryS bs = new BinaryS();
	 bs.BinarySearch(arr1,'h');
  }
 }