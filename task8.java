import java.util.*;
class task8 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int a=0;
        int b=1 , c;
        int n=sc.nextInt();
        if(n>=1){
            System.out.print(a+" ");
        }if(n>=2){
            System.out.print(b+" ");
        }
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

        

    }
    
}
