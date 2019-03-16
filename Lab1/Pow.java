class Pow
{
	public static boolean check(int n)
	{
		int rem=n%2;
		while(n!=1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
		}
	return true;
	}
	public static void main(String args[])
	{
		System.out.println(check(Integer.parseInt(args[0])));
	}
}