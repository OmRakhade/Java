public class bubblesort {
    public static void main(String[] args) {
        int [] arr = {10,20,15,25,12,40,5,46};
        // int arr[] = {5,10,15,20,25,25};
        int n = arr.length;
        boolean swaped;
        long time = System.nanoTime();
        for(int i = 0; i< n-1;i++){
            swaped = true;

            for(int j=0;j<(n-i-1);j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swaped = false;
                }
            }
            if(swaped){
                break;
            }
        }
        long time1 = System.nanoTime();

        System.out.println("Printing Array : ");
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("Time required for sorting: ");
        System.out.println("time :- "+(time1-time));
    }
}
