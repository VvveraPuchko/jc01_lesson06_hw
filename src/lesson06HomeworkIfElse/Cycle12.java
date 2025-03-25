package lesson06HomeworkIfElse;

public class Cycle12 {

	public static void main(String[] args) {
		int a1 = 1;
		long pr = 1;
		int x = a1;
		
		for(int i = 1; i <= 10; i++) {
			pr = pr * x;
			x = x + 6;
		}
		System.out.println("Произведение первых 10 членов = " + pr);
	}

}
