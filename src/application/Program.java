package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product fng = new Product();
		
		fng.name = sc.nextLine();
		fng.grade1 = sc.nextDouble();
		fng.grade2 = sc.nextDouble();
		fng.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", fng.finalGrade());
		
		if (fng.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", fng.missingPoints());
		} else {
			System.out.println("PASS");
		}
				
		sc.close();
	}

}
