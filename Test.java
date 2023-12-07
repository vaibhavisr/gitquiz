import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	String input = reader.nextLine();
	int n1 = Integer.valueOf(input.substring(0,1));
	int n2 = Integer.valueOf(input.substring(2,3));

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