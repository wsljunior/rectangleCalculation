package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			Rectangle rectangle = new Rectangle();
			System.out.println("Enter data of Rectangle");
			System.out.println("Width Value: ");
			rectangle.width = sc.nextDouble();
			System.out.println("Heigth Value: ");
			rectangle.heigth = sc.nextDouble();
			System.out.println("Area Value: " + rectangle.area());
			System.out.println("Perimeter Value: " + rectangle.perimeter());
			System.out.println("Diagonal Value: " + rectangle.diagonal());
		}
	}

}
