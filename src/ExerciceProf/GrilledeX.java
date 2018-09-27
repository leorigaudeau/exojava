package ExerciceProf;

import java.util.Scanner;

public class GrilledeX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer n = null;
		Integer m = null;

		try {
			System.out.print("colonnes = ");
			String sn = sc.nextLine();
			n = Integer.parseInt(sn);

			System.out.print("lignes =");
			String sm = sc.nextLine();
			m = Integer.parseInt(sm);
			for (int l = 0; l < m; l++) {

				for (int c = 0; c < n; c++) {
					System.out.print("x ");
				}
				System.out.println();

			}
		} catch (NumberFormatException e) {
			System.out.println("Veuillez entrer des nombres !");
		} catch (NullPointerException e) {
			System.out.println("Erreur Interne veuillez recommencer ! ");
		}

	}

}
