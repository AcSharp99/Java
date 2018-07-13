import java.util.*;
import java.lang.*;
class prac2_4{
	public static void main(String a[])
	{
		int c=0;
		System.out.println("Enter your String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char b[]=new char[str.length()];
		b[0]=str.charAt(0);
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				b[i]=str.charAt(i+1);
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>=65&&b[i]<=90)
			{
				c++;
			}
		}
		System.out.println("Number of words that start with capital letters is "+c);
	}
}
