class TD
{
	public static void main(String[] args)
	{
		int n =Integer.parseInt(args[0]);
		int[][] arr = new int[n][n];
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}
	}
}
