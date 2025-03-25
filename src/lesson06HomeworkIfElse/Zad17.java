package lesson06HomeworkIfElse;

public class Zad17 {

	public static void main(String[] args) {
		int m = 36;
		int n = 357;
		
		if(m == n) {
			m = 0;
			n = 0;
		} else if(m > n) {
			n = m;
		} else {
			m = n;
		}
		
		System.out.println(m);
		System.out.println(n);
	}

}
