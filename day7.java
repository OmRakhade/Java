import java.util.ArrayList;
import java.util.List;

public class day7 {
    public static void main(String[] args) {
        recursionProblems r = new recursionProblems();
        int[] arr = {1,2,1};
        int sum = 2;
        // r.getAllSubsequences(0,arr,new ArrayList<>());
        // r.getSubsequnces(0, arr, sum, new ArrayList<>(),0);
        int count = r.getCoutnOfSubsequences(0, arr, sum, 0, 0);
        System.out.println("COUNT = "+count);
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

    // problem :- count of subsequences having sum = k.
    // ex:- arr = {1,2,1}, sum = 2 =>total count = 2

    int getCoutnOfSubsequences(int ind,int[] arr, int sum, int cSum, int count){

        if(ind>=arr.length){
            if(cSum == sum){
                return 1;
            }
            return 0;
        }
        
        int left =  getCoutnOfSubsequences(ind+1, arr, sum, cSum+arr[ind], count);

        int right = getCoutnOfSubsequences(ind+1, arr, sum, cSum, count);

        return left+right;
    }
}