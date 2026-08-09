import java.util.Scanner;
public class task9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int rev=0;
        while(num!=0){
        int r=num%10;
        rev=rev*10;
        rev=r+rev;
        num=num/10;
        }
        System.out.println(rev);
        if(rev==original){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
