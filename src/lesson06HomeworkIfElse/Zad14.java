package lesson06HomeworkIfElse;

public class Zad14 {

	public static void main(String[] args) {
		int ang1 = 12;
		int ang2 = 78;
		int sum = ang1 + ang2;
		
		if(sum < 180) {
			System.out.println("Треугольник существует, тк сумма углов менее 180 градусов");
			if(ang1 == 90 || ang2 == 90 || (180 - sum) == 90) {
				System.out.println("Треугольник прямоугольный");
			} else {
				System.out.println("Треугольник НЕ прямоугольный");
			}
		} else {
			System.out.println("Треугольник НЕ существует");
		}

	}

}
