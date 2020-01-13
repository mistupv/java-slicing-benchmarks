class Main{
	
	private static int sum = 0;
	
	public static void main(String args[])
	{
		// int sum = 0;
		int i = 1;
		while (i < 11)
		{
			sum = A.a(sum,i);
			i = new Increment().increment(i);
		}
		System.out.println("Sum: "+sum+ ", i: "+i);
	}
}

class A
{
	public static int a(int x, int y)
	{
		return new Add().add(x,y);
	} 
}

class Add
{
	public int add(int a, int b)
	{
		return a + b;
	}
}

class Increment extends Add
{
	public int increment(int z)
	{
		return add(z,1);
	}
}	