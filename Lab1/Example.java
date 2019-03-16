public class Example
{
	enum Days
	{
		SUNDAY(0),MONDAY(1);
		int x;
		Days(int x)
		{
			this.x=x;
		}
		public int getx()
		{
			return x;
		}
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}	
     public static void main(String []args)
     {
        Example en =new Example();
		System.out.println(Days.MONDAY.getx());
		for(Days d:Days.values())
		{
			System.out.println(d);
		}
     }
}