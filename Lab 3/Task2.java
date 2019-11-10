import java.util.Arrays;
 


 class BinaryS{


    public void BinarySearch(String arr[], String x ){
        Arrays.sort(arr);
        int p= 0;
        int q = arr.length-1;

       String y= null;
       while(y!=x){
        if(p>q){
            System.out.println("value does not exist");
            break;
        }
        else{
            int mid = (p+(q-p))/2;
            if(arr[mid].equals(x)){
                System.out.println("String found at index"+mid);
                y=x;
            }
            else if(arr[mid].compareTo(x)<0){
                p = mid+1;
            }
            else if(arr[mid].compareTo(x)>0){
                q = mid-1;
            }
        }
       }

    }
}

class Task2{
    public static void main(String args[]){
        System.out.println("Applying binary search to a an array of strings...");
        String array[]= {"muntaha","rohat", "fatima", "unsa", "alwaaz", "aliza", "habiba","anshrah" };
        System.out.println("Finding fatima in the array of strings using binary search...");
        String locate = "fatima";
        BinaryS bs = new BinaryS();
        bs.BinarySearch(array,locate);

    }
}