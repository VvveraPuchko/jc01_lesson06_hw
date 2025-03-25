package lesson06HomeworkIfElse;

public class Cycle09 {

	public static void main(String[] args) {
		double a = 1;
		double b = 100;
		double sum = 0;
		
		for(double i = a; i <= b; i++) {
			sum = sum + Math.pow(i,2);
		}
		
		System.out.println(sum);

	}

}
