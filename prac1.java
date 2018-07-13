class prac1 
{
	public static void main(String a[])
	{
		int i,sum=0,p;
		double per;
		for(i=0;i<6;i++)
		{
			p=Integer.parseInt(a[i]);
			sum =sum+p;
		}
		per=sum*100/600;
		if(per<=100 && per>=80)
			System.out.println("Grade = A ");
		else if(per<80 && per>=50)
			System.out.println("Grade = B ");
		else
			System.out.println("Grade = C");
		
		System.out.println("sum = " +sum+ "\npercentage = " +per);
	}
}
			
		
