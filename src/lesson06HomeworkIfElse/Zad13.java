package lesson06HomeworkIfElse;

public class Zad13 {

	public static void main(String[] args) {
		double x1 = 98.1;
		double x2 = 17.9;
		double y1 = 75.13;
		double y2 = 937.16;
		
		double d1 = Math.sqrt((x1 * x1) + (y1 * y1));
		
		double d2 = Math.sqrt((x2 * x2) + (y2 * y2));
		
		if(d1 > d2) {
			System.out.println("точка B ближе");
		}
		else if(d1 == d2){
			System.out.println("равноудалены");
		} else {
			System.out.println("точка A ближе");
		}
		

	}

}
