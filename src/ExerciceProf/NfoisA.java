package ExerciceProf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NfoisA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer n = null;
		Integer a = null;

		try {
			System.out.print("n= ");
			String sn = sc.nextLine();
			n = Integer.parseInt(sn);

			System.out.print("a=");
			String sa = sc.nextLine();
			a = Integer.parseInt(sa);

			for (int i = 0; i < n; i++) {
				System.out.print(a);
			}

		} catch (NumberFormatException e) {
			System.out.println("Veuillez entrer des nombres !");
		} catch (NullPointerException e) {
			System.out.println("Erreur Interne veuillez recommencer ! ");
		}
	}

}
