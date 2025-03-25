package lesson06HomeworkIfElse;

import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите действительное число x: ");
		
		double x;
		x = scanner.nextDouble();
		
		System.out.println("Введите действительное число y: ");
		
		double y;
		y = scanner.nextDouble();
		
		System.out.println("Введите действительное число z: ");
		
		double z;
		z = scanner.nextDouble();
		
		if(x >= 0) {
			x = Math.pow(x, 2);			
		}
		else {
			x = Math.pow(x, 4);	
		}
		
		if(y >= 0) {
			y = Math.pow(y, 2);			
		}
		else {
			y = Math.pow(y, 4);	
		}
		
		if(z >= 0) {
			z = Math.pow(z, 2);			
		}
		else {
			z = Math.pow(z, 4);	
		}
		
		System.out.println("x: " + x + " y: " + y + " z: " + z);
		
		scanner.close();

	}

}
