import java.util.*;
class task2{


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] val = new int[n];
    
    for(int i=0;i<n;i++){
       val[i]=sc.nextInt();
    }
        int index=sc.nextInt();
        
        if(index>=0&& index<n){
            System.out.println(val[index]);
        }
    }

}
