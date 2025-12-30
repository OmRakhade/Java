import java.util.HashSet;

public class day9 {
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    solution s = new solution();
     int val = s.removeDuplicates(nums);
     System.out.println("Output :- "+ val);
    for (int i : nums) {
        System.out.println(i);
    }
    
}
}
class solution{
    int removeDuplicates(int [] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}