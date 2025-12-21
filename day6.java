public class day6 {
    public static void main(String[] args) {
        rec1 r = new rec1();
        // r.function(1, 5);
        // r.function1( 5);
        // int sum = r.fun(5);
        // System.out.println("sum = "+sum);
        // int fact = r.factorail(5);
        // System.out.println("Factorial value : "+fact);

        // int[] arr = {2,3,4,5,6};
        // r.reverseArray(arr);

        // System.out.println("reversed array : ");
        // for(int num:arr){
        // System.out.print(num+" ");
        // }

        boolean res = r.isPalindrome("abba", 0, 3);
        System.out.println("Is palindrom : " + res);
    }
}

class rec1 {

    void function(int count, int n) {
        if (count > n)
            return;

        System.out.print(count + " ");
        count++;
        function(count, n);

    }

    void function1(int n) {
        if (n < 1)
            return;

        System.out.println(n);

        function1(n - 1);
    }

    int fun(int n) {
        if (n == 1)
            return n;

        return n + fun(n - 1);
    }

    int factorail(int n) {
        if (n == 0)
            return 1;

        return n * factorail(n - 1);
    }

    void reverseArray(int arr[]) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }

    }

    boolean isPalindrome(String s, int start, int end) {
        if (start > end)
            return true;

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }
}