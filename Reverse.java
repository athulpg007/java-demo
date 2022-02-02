public class Reverse
{
	public static void main(String args[])
	{

		String input = args[0];
		String output = "";

		for (int i=input.length()-1; i>=0; i--)
		{
			output+=input.charAt(i);
		}

		System.out.println("Reverse : " + output);
	}
}