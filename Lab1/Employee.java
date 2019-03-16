class EmplyoeeData
{
	private int id;
	private String name;
	private String doj;
	private char desig;
	private String dept;
	private int basic;
	private int hra;
	private int it;
	EmplyoeeData(int id,String name,String date, char desig,String dept,int basic,int hra,int it)
	{
		this.id=id;
		this.name=name;
		this.doj=date;
		this.desig=desig;
		this.dept=dept;
		this.it=it;
		this.basic=basic;
		this.hra=hra;
	}
	public void getdata()
	{
		System.out.println(id+" " +name+" "+doj+" " +desig+" " +dept+" "+basic+" " +hra +" "+it);
	}
	public int getId()
	{
		return id;
	}
	public char getDesig()
	{
		return (char)desig;
	}
	public int getBasic()
	{
		return basic;
	}
	public int getHra()
	{
		return hra;
	}
	public int getIt()
	{
		return it;
	}
}

class DesgData
{
	private char desig;
	private String designa;
	private int da;
	DesgData(char desig,String designa,int da)
	{
		this.desig=desig;
		this.designa=designa;
		this.da=da;
	}
	public void getdata()
	{
		System.out.println(desig+" " +designa+" "+da);
	}
	public char getDesig()
	{
		return (char)desig;
	}
	public int getDa()
	{
		return da;
	}
}
	
class Employee
{
	public static void  main(String[] args)
	{
		EmplyoeeData[] data = {new EmplyoeeData(1001,"Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
						   new EmplyoeeData(1002, "Sushma" ,"23/08/2012", 'c', "PM", 30000, 12000, 9000),
						   new EmplyoeeData(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
						   new EmplyoeeData(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
						   new EmplyoeeData(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
						   new EmplyoeeData(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000,9000,4400),
							new EmplyoeeData(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)};
		//System.out.println(data);
		DesgData[] desg = {new DesgData('e', "Engineer",20000),
						   new DesgData('c', "Consultant", 32000),
						   new DesgData('k', "Clerk", 12000),
						   new DesgData('r', "Receptionist", 15000),
							new DesgData('m', "Manager", 40000)};
							
		System.out.println("Employee details is ");
		boolean bool=false;
		for(EmplyoeeData a:data)
		{
			if(Integer.parseInt(args[0])==a.getId())
			{
				a.getdata();
				for(DesgData b:desg)
				{
					if(a.getDesig()==b.getDesig())
					{
						bool=true;
						//System.out.println(b[0]+" "+b[1]+" "+b[2]);
						b.getdata();
						int sum=a.getHra()+a.getBasic()-a.getIt()+b.getDa();
						System.out.println("Salary is "+sum);
						break;
					}
				}
			}
		}
		if(!bool)
		{
			System.out.println("There is no employee with id "+args[0]);
		}
	}
}	