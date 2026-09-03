import java.util.*;

import java.time.*;
class agecalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the birth year:");
        int birth=sc.nextInt();
        int currentyear=LocalDate.now().getYear();
        int age=currentyear-birth;
        System.out.println("your age is:"+age);
        System.out.println("current date:"+LocalDate.now());
        System.out.println("current time:"+LocalTime.now());
        sc.close();
    }
}