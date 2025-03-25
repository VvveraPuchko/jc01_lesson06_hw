package lesson06HomeworkIfElse;

public class Zad15 {

	public static void main(String[] args) {
		double a = 127;
		double b = -165;
		double x = a;
		double y = b;
		
		if(a < b) {
			a = (x + y)/2;
			b = 2 * x * y;
		} else {
			b = (x + y)/2;
			a = 2 * x * y;
		}
		
		System.out.println("a " + a + " b " + b);

	}

}
