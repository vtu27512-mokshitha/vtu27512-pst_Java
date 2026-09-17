import java.util.Scanner;
class task7 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int esum=0;
        int osum=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;  
        if(rem%2==0){
            esum=esum+rem;
        }else{
            osum=osum+rem;
        }
    } 
            System.out.printf("even sum %d\n",esum);
            System.out.printf("odd sum %d " ,osum);
}
}