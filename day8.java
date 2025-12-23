public class day8 {
    public static void main(String[] args) {
        // // Searching => linear and binary
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
        System.out.println("Time required for Recursive Binary search :"+(end3-start3)/10000);

        // // shifting elements in array
        int arr1[] = { 10, 20, 30, 40, 50 };
        int key1 = 3;
        ShiftingArrayElement a = new ShiftingArrayElement();
        a.ShiftToRight(arr1, key1);

        for (int elem : arr1) {
            System.out.print(elem + " ");
        }

    }

}

class ShiftingArrayElement {
    void reverse(int[] arr, int p0, int p1) {
        while (p0 < p1) {
            int temp = arr[p0];
            arr[p0] = arr[p1];
            arr[p1] = temp;

            p0 += 1;
            p1 -= 1;
        }
    }

    void ShiftToRight(int[] arr, int key1) {
        // reverse whole array 50 40 30 20 10
        reverse(arr, 0, (arr.length - 1));

        // reverse array up to the key is given. from left to key-1.  40 50 30 20 10
        reverse(arr, 0, key1 - 1);

        // reverse array from key-1 to lenght of array. 40 50 10 20 30
        reverse(arr, key1, arr.length - 1);

    }
}

class Search {
    void linearSearch() {
        int arr[] = { 10, 20, 30, 40, 50 };
        int key = 40;

        for (int element : arr) {
            if (element == key) {
                System.out.println("Element found.");
                return;
            }
        }
    }

    void binarySearch() {
        int arr[] = { 10, 20, 30, 40, 50 };
        int key = 40;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (arr[mid] == key) {
                System.out.println("Element Found");
                return;
            }
            if (key >= arr[mid])
                left = mid + 1;
            if (key < arr[mid])
                right = mid - 1;
        }
    }

    boolean binarySearchUsingRecursion(int[] arr, int key, int l, int r) {
        if (l > r) {
            System.out.println("Element not found");
            return false;
        }
        int mid = l + (r - l) / 2;

        if (arr[mid] == key) {
            System.out.println("Element Found.");
            return true;
        }

        if (key < arr[mid]) {
            binarySearchUsingRecursion(arr, key, l, r - 1);
        } else {
            binarySearchUsingRecursion(arr, key, l + 1, r);
        }

        return false;

    }
}
