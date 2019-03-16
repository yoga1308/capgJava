class Avg
{
	public static float avg(int n)
	{
		int sum=0;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			count++;
		}
		return sum/count;
	}
	public static void main(String args[])
	{
		int n =Integer.parseInt(args[0]);
		System.out.println("Average is "+avg(n));
	}
}
		