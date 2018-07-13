import java.util.*;
import java.lang.*;
class prac2_6{
	static String getline(){
		Scanner sc=new Scanner(System.in);
		return(sc.nextLine());
	}
	public static void main(String a[]){
		System.out.println("Enter your String : ");
		String str;
		int f=0,v=0,sum=0;
		while(true){
			str=getline();
			if(str.compareToIgnoreCase("quit")==0)
			{
				System.out.println("Total vowels : "+sum);
				break;
			}
			int l=str.length();
			for(int i=0;i<l;i++)
			{
				char ch;
				ch=str.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					v++;
				}
			}
			sum=sum+v;
			System.out.println("Vowels : "+v);
			v=0;
			}
	}
}
