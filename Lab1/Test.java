class demo2
{
	demo2(int i)
	{
		System.out.println(i);
	}
}
class demo1
{
	int i;
	public static void main(String[] args)
	{
		final int j=0;
		System.out.println(i);
		j=1;
		demo2 d= new demo2();
	}
}