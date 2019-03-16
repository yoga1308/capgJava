class Calculate
{
	public int calculate(int n)
	{
		int sum=0;
		int pow=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			pow=pow+(i*i);
		}
		return pow-sum;
	}
}
class  Pas
{
	public static void main(String[] args)
	{
		Calculate c = new Calculate();
		System.out.println(c.calculate(3));
	}
}