package lesson06HomeworkIfElse;

public class Cycle07 {

	public static void main(String[] args) {
		double a = 16;
		double b = 35.1;
		double h = 4.2;
		double y;
		
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		
		for (double x = a; x <= b; x = x + h) {
			if(x > 2) {
			y = x;
			} else {
				y = -x;
			}
			System.out.printf("|\t%3.1f\t|\t%4.1f\t|\n", x, y);
			
		}
		
	}

}
