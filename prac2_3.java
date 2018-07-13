import java.util.*;
class prac2_3{
	public static void main(String a[])
	{
		int v=0,c=0;
		System.out.println("Enter your String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			char ch;
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("Constant : "+c+"\nVowels : "+v);
	}
}
