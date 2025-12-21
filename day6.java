public class day6 {
    public static void main(String[] args) {
        rec1 r = new rec1();
        r.function(1, 5);
    }
}


class rec1{

    void function(int count,int n){
        if(count > n)
            return;

        System.out.print(count+" ");
        count++;
        function(count, n);
        
    }
}