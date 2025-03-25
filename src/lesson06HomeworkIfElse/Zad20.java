package lesson06HomeworkIfElse;

public class Zad20 {

	public static void main(String[] args) {
		int a = 23;
		int b = 7;
		int c = 11;
		int k = 4;
		
		if(a % k == 0) {
			System.out.println("число k делитель для числа а");
		}
		
		if(b % k == 0) {
			System.out.println("число k делитель для числа b");
		}
		
		if(c % k == 0) {
			System.out.println("число k делитель для числа c");
		}
		if(a % k != 0 && b % k != 0 && c % k != 0) {
			System.out.println("число k не делитель для всех чисел");
		}
		

	}

}
