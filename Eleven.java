class Nine
{
	void school()
	{
		System.out.println("learn inheritance");
	}
}

class Eleven extends Nine
{
	void play()
	{
		System.out.println("play method");
	}

	public static void main(String args[])
	{
		Eleven t1 = new Eleven();
		t1.play();
		t1.school();
	}
}