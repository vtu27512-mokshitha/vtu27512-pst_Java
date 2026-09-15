import java.util.*;
import java.lang.*;
import java.io.*;

class lapindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereSca
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
		    String s=sc.nextLine();
		    int len=s.length();
		    String first=s.substring(0,len/2);
		    String second=s.substring(len/2+1);
		    HashMap<Character,Integer> map1=new HashMap<>();
		    HashMap<Character,Integer> map2=new HashMap<>();
		    for( int j =0;i<first.length();i++){
		        map1.put(first.charAt(i),map1.getOrDefault(first.charAt(i),0)+1);
		    }
		    for( int j=0;i<second.length();i++){
		        map2.put(second.charAt(i),map2.getOrDefault(second.charAt(i),0)+1);
		    }
		    
		    if(map1.equals(map2)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}