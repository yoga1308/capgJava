import java.util.*;

class Third
{
	public static void main(String[] args)
	{
	String str="amit true 12 false 34 asd";
	Scanner sc = new Scanner(str);
	while(sc.hasNext())
	{
		if(sc.hasNextBoolean())
		{
			System.out.println(sc.nextBoolean());
			
		}
		sc.next();
	}}
}