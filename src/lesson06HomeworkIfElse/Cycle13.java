package lesson06HomeworkIfElse;

public class Cycle13 {

	public static void main(String[] args) {
		int a = -5;
		int b = 5;
		double h = 0.5;
		double y;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <= b; x = x + h) {
			y = 5 - (Math.pow(x, 2)/2);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			
		}
		System.out.println("---------------------------------");

	}

}
