package lesson06HomeworkIfElse;

public class Cycle11 {

	public static void main(String[] args) {
		int a = 1;
		int b = 200;
		double cube;
		double razn = 0;
		
		for(int i = a; i <= b; i++) {
			cube = Math.pow(i,3);
			razn = razn - cube;
			
		}
		System.out.println(razn);

	}

}
