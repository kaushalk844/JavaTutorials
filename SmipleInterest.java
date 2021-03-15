package Learning;
import java.util.Scanner;

public class SmipleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of Pricipal: ");
		int principal = sc.nextInt();
		System.out.print("Enter the value of Rate: ");
		float rate = sc.nextFloat();
		System.out.print("Enter the value of Time: ");
		int time = sc.nextInt();
		
		float simpleInterest = principal * rate * time / 100;
		
		System.out.println("Simple Interest is : " + simpleInterest);

	}

}
