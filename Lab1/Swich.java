class Swich
{
	public static void main(String args[])
	{
		switch((Integer.parseInt(args[0])))
		{
			case 1:
			System.out.println("January:31");
			break;
			case 2:
				boolean leap=false;
				int year = Integer.parseInt(args[1]);
				if(year % 4 == 0)
				{
					if( year % 100 == 0)
					{
						if ( year % 400 == 0)
							leap = true;
						else
							leap = false;
					}
					else
					leap = true;
				}	
				else
					leap = false;
				if(leap)
				{
					System.out.println("Feb:29");
				}
				else
				{
					System.out.println("Feb:28");
				}
			break;
			case 3:
			System.out.println("March:31");
			break;
			case 4:
			System.out.println("April:30");
			break;
			case 5:
			System.out.println("May:31");
			break;
			case 6:
			System.out.println("June:30");
			break;
			case 7:
			System.out.println("July:31");
			break;
			case 8:
			System.out.println("August:31");
			break;
			case 9:
			System.out.println("September:30");
			break;
			case 10:
			System.out.println("October:31");
			break;
			case 11:
			System.out.println("Novomber:30");
			break;
			case 12:
			System.out.println("December:31");
			break;
			default:
			System.out.println("please give valid month(1-12)");
		}
	}
}