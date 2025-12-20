// Print Name N times using Recursion

import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number until wants to print name : ");
        int  count = s.nextInt();
        function(count);
        s.close();
    }

    static void function(int n){
        
        if(n<=0){
            return;
        }
        System.out.print("Om  ");
        n--;
        function(n);
    }
}

