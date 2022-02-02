class Fifth
{
	Fifth(int a)
	{
		System.out.println("My first costructor.");
	}

	Fifth(double a, double b)
	{
		System.out.println("My second costructor.");
	}

	Fifth(char c, double a, double b)
	{
		System.out.println("My third costructor.");
	}

	public static void main(String args[])
	{
		System.out.println("We love software testing");
		new Fifth(1);
		new Fifth(0.1, 0.2);
		new Fifth('a', 0.1, 0.2);
	}





}