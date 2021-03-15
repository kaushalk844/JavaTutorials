package Learning;

public class TypeCasting //TypeCasting is of two types:-1.Widening ,2.Narrowing
{

	public static void main(String[] args) {
		
		//Widening:- Also know as Automatic TypeCasting
		int i = 20;
		System.out.println("Before Type Casting: " + i);
		float f = i;
		System.out.println("After Type Casting: " + f);
		
		//Narrowing:- Also know as Manual TypeCasting
		float g = 40f;
		System.out.println("Before Type Casting: " + g);
		int h =(int) g;
		System.out.println("After Type Casting: " + h);
	}

}
