import java.util.ArrayList;
import java.util.List;

public class day7 {
    public static void main(String[] args) {
        recursionProblems r = new recursionProblems();
        int[] arr = {1,2,1};
        // r.getAllSubsequences(0,arr,new ArrayList<>());
        r.getSubsequnces(0, arr, 2, new ArrayList<>(),0);
    }
}

class recursionProblems{

    // problem :- print all the subsequences are contineuos or non-contineous but it follow the order.
    //example :-  [3,1,2] = {{},1,2,3,[3,1],[3,2],[1,2],[3,1,2]} 

    void getAllSubsequences(int ind,int[] arr,List<Integer> current){
       if(ind >= arr.length){

        System.out.println(current);

        return;
       }

    //    take the element 
    current.add(arr[ind]);
    getAllSubsequences(ind+1, arr, current);

    //   backtrack remove the last element
    current.remove(current.size()-1);

    // do not take the element
    getAllSubsequences(ind+1, arr, current);
    }

    // problem:- print all the subsequences whos sum is equal to sum.
    // example :-arr = {1,2,1}, sum = 2=> {[1,1],[2]}

    void getSubsequnces(int ind,int[] arr,int sum,List<Integer> current,int csum){
        if(ind >= arr.length){
            if(csum == sum){
                System.out.println(current);
            }
            return;
        }

        //  take the element 
        current.add(arr[ind]);
        getSubsequnces(ind+1, arr, sum, current, csum+arr[ind]);

        // backtrack 
        current.remove(current.size()-1);

        //  move forward without element
        getSubsequnces(ind+1, arr, sum, current, csum);

    }
}