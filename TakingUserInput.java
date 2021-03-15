package Learning;

import java.util.Scanner;

public class TakingUserInput
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();			//For Integer Value
		float f = sc.nextFloat();		//For Float Value
		double d = sc.nextDouble();		//For Double Value
		
		String str = sc.nextLine();		//For String Value
		
		System.out.println(a);
		System.out.println(f);
		System.out.println(d);
		System.out.println(str);
	}

}
