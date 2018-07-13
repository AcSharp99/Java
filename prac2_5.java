import java.util.*;
import java.lang.*;
class prac2_5{
	public static void main(String a[]){
		System.out.println("Enter your String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		int m=l/2;
		int flag=0;
		for(int i=0;i<m;i++)
		{
			if(str.charAt(i) != str.charAt(l-i-1))
			{
				flag++;
			}
			else
			{
				//flag++;
			}
		}
		if(flag==0){
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Non-Palindrome");
	}
	}
}
