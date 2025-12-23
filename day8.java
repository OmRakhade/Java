public class day8 {
    public static void main(String[] args) {
        // Searching => linear and binary
        Search s = new Search();
        int arr [] = {10,20,30,40,50};
        int key = 20;

        int left = 0;
        int right = arr.length-1;

        long start1 = System.nanoTime();
        s.linearSearch();
        long end1 = System.nanoTime();
        
        long start2 = System.nanoTime();
        s.binarySearch();
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        s.binarySearchUsingRecursion(arr, key, left, right);
        long end3 = System.nanoTime();

        // compairing the performance time.
        System.out.println("Time required for linear search : "+(end1-start1)/10000);
        System.out.println("Time required for Binary search : "+(end2-start2)/10000);
        System.out.println("Time required for Recursive Binary search : "+(end3-start3)/10000);
        
    }

}


 
class Search{
    void linearSearch(){
        int arr [] = {10,20,30,40,50};
        int key = 40;

        for(int element: arr){
            if(element == key){
                System.out.println("Element found.");
                return;
            }
        }
    }

    void binarySearch(){
        int arr [] = {10,20,30,40,50};
        int key = 40;

        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (right+left)/2;

            if(arr[mid] == key){
                System.out.println("Element Found");
                return;
            }
            if(key >= arr[mid])
                left = mid+1;
            if(key < arr[mid])
                right = mid - 1;
        }
    }

    boolean binarySearchUsingRecursion(int[] arr,int key, int l,int r){
        if(l > r){
            System.out.println("Element not found");
            return false;
        }
        int mid = l + (r - l)/2;

        if(arr[mid] == key){
            System.out.println("Element Found.");
            return true;
        }

        if(key < arr[mid]){
            binarySearchUsingRecursion(arr, key, l, r-1);
        }
        else{
            binarySearchUsingRecursion(arr, key, l+1, r);
        }

        return false;

    }
}


