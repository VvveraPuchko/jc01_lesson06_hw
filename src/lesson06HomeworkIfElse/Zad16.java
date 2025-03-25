package lesson06HomeworkIfElse;

import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите координату x: ");
		int x = scanner.nextInt();

		System.out.print("Введите координату y: ");
		int y = scanner.nextInt();

		if (x == 0 && y == 0) {
			System.out.println("Точка находится в начале координат.");
		} else if (x == 0) {
			System.out.println("Точка лежит на оси Y.");
		} else if (y == 0) {
			System.out.println("Точка лежит на оси X.");
		} else if (x > 0 && y > 0) {
			System.out.println("Точка находится в I четверти.");
		} else if (x < 0 && y > 0) {
			System.out.println("Точка находится во II четверти.");
		} else if (x < 0 && y < 0) {
			System.out.println("Точка находится в III четверти.");
		} else {
			System.out.println("Точка находится в IV четверти.");
		}

		scanner.close();
	}

}
