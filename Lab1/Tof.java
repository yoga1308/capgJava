class  Tof
{
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				//System.out.println(i);
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println(calculateSum(10));
	}
}