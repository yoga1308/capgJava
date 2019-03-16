class Inc
{
	public static boolean check(int n)
	{
		boolean ans=true;
		int r=n%10;
		n=n/10;
		while(n>0)
		{
			int r2=n%10;
			if(r2>r)
			{
				ans=false;
				return ans;
			}
			r=r2;
			n=n/10;
		}
		return ans;
	}
	public static void main(String args[])
	{
		System.out.println(check(133486));
	}
}