package lesson06HomeworkIfElse;

public class Cycle14 {

	public static void main(String[] args) {
		int n = 628;
		double sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum = sum + 1.0/i;
		}
		
		System.out.println(sum);
	}

}
