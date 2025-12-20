// Print Name N times using Recursion

// import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {

        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the number until wants to print name : ");
        // int count = s.nextInt();
        // function(count);
        // s.close();

        // recursiveClass r = new recursiveClass();
        // r.function("Om", 0, 3);

        recursiveClass r = new recursiveClass("Om", 3);
        r.function(0);
    }

    // static void function(int n){

    // if(n<=0){
    // return;
    // }
    // System.out.print("Om ");
    // n--;
    // function(n);
    // }
}

// class recursiveClass {

// public void function(String name, int count, int N){
// if (count == N)
// return;

// System.err.print(name+" ");
// function(name, count+1, N);
// }

// }

class recursiveClass {
    String name;
    int N;

    recursiveClass(String name, int N) {
        this.name = name;
        this.N = N;
    }

    public void function(int count) {
        if (count == N)
            return;

        System.err.print(name + " ");
        function(count + 1);
    }

}
