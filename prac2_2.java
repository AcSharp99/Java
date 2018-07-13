import java.util.*;
class prac2_2{
	public static void main(String a[])
	{
		System.out.println("Enter your String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		int m=l/2;
		for(int i=m;i<l;i++)
		{
			System.out.print(str.charAt(i));
		}
	}
}
