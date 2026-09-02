import java.util.Scanner;
class Solution {
   
    public boolean halvesAreAlike(String s) {
        int count1=0;int count2=0;
        int len=s.length();
        for(int i=0;i<len/2;i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                    count1++;
            }
        }
        for(int i=len/2;i<len;i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                count2++;
            }
        }
        return count1==count2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        String s = sc.nextLine();
        boolean result = solution.halvesAreAlike(s);
        System.out.println(result); 
    }
}