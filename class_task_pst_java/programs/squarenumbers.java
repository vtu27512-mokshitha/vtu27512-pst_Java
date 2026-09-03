import java.util.*;
public class squarenumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }
        System.out.println("squares of the numbers is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}