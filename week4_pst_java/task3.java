import java.util.*;
class MoveZeroes {
public void moveZeroes(int[] nums) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos]=nums[i];
                pos++;
            }
        }
        while(pos<nums.length){
            nums[pos++]=0;
        }
       
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }   
        MoveZeroes mv=new MoveZeroes();
        mv.moveZeroes(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        
    }
}