class Bubble
{
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("Please provide numbers");
		}
		else
		{
		int arr[]= new int[5];
		
		for(int i=0;i<args.length;i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp =arr[j];
					arr[j] =arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Correct order is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}
	}
}
			