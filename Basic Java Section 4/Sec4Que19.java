//. //Write a program to print all numbers between 1 & 100 which are divisible by 3 and 5 both

public class Sec4Que19{
	public static void main(String []args)
	{
		int N = 100;
		for (int i= 0; i < N; i++)
		{			
			if (i % 3 == 0 && i% 5 == 0)
				System.out.print(i+ " ");
		}
	}
}





