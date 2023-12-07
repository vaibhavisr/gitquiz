//import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		//Scanner reader = new Scanner(System.in);
	//String input = reader.nextLine();
	String s1 = args[0];
	String s2 = args[1];

	int n1 = Integer.parseInt(s1);
	int n2 = Integer.parseInt(s2);


	Quiz fi = (int a, int b) ->
	{
		int sum = 0;
		for(int i = a; i <=b; i++)
		{
			sum+=i;
		}
		return sum;
	};
	System.out.println(fi.add(n1, n2));

	}
}