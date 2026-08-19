import java.util.*;
class Solution {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b)->{
            String ab=a+b;
            String ba=b+a;

            return ba.compareTo(ab);
        });
        StringBuilder sb=new StringBuilder();
        for(String i: arr){
            sb.append(i);
        }
         String result=sb.toString();
         if(result.charAt(0)=='0'){
            return "0";
         }
         return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 30, 34, 5, 9};
        String largestNum = solution.largestNumber(nums);
        System.out.println(largestNum); 
    }
}