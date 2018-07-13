class prac2_1{
	public static void main(String a[]){
		int temp,n;
		n=a.length;
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=Integer.parseInt(a[i]);
		}
		System.out.println("Your Entered array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("Your Sorted array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}		
	}
}
