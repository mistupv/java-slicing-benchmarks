public class Horwitz{
	public static void main(String args[])
	{
		int sum = 0;
		int i = 1;
		while (i < 11)
		{
			sum = A(sum,i);
			i = Increment(i);
		}
		System.out.println("Sum: "+sum+ ", i: "+i);
	}

	public int A(int x, int y)
	{
		return Add(x,y);
	}

	public int Add(int a, int b)
	{
		return a + b;
	}

	public int Increment(int z)
	{
		return Add(z,1);
	}
}