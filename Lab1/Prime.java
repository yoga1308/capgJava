class Prime
{
	public static void main(String args[])
	{
		boolean bool=true;
		int n =Integer.parseInt(args[0]);
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				bool=false;
			}
		}
		System.out.println(bool);
	}
}
		