package ExerciceProf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Double a = null;
		Double b = null;

		try {
			System.out.print("a= ");
			a = sc.nextDouble();

			System.out.print("b=");
			b = sc.nextDouble();
			
			System.out.print("a+b=");
			System.out.println(a + b);

		} catch (InputMismatchException e) {
			System.out.println("Veuillez entrer des nombres !");
		} catch (NullPointerException e) {
			System.out.println("Erreur Interne veuillez recommencer ! ");
		}
	}

}
