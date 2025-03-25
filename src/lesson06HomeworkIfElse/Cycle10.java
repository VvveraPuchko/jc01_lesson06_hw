package lesson06HomeworkIfElse;

public class Cycle10 {

	public static void main(String[] args) {
		int a = 1;
		int b = 200;
		double qv;
		double pr = 1;
		
		for(int i = a; i <= b; i++) {
			qv = i * i;
			pr = pr * qv;
		}
		

		System.out.println(pr);

	}

}
