public class day8 {
    public static void main(String[] args) {
        Search s = new Search();
        int arr [] = {10,20,30,40,50};
        int key = 20;

        int left = 0;
        int right = arr.length-1;

        // s.linearSearch();
        // s.binarySearch();
        s.binarySearchUsingRecursion(arr, key, left, right);
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
