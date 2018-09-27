package ExerciceProf;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Integer nbfinal =new Random().nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer votre premier nombre entre 0 et 100");
		Integer nbcheck = Integer.parseInt(sc.nextLine());
		
		while (nbcheck != nbfinal) {
			
			if(nbcheck<nbfinal) {
				System.out.println("Le nombre à trouver est plus grand");
			}else {
				System.out.println("Le nombre à trouver est plus petit");
			}
			System.out.println("Enter a nouveau un nombre a chercher");
			nbcheck = Integer.parseInt(sc.nextLine());
			
		}
		System.out.print("Félicitaion le nombre était ");
		System.out.println(nbfinal);
		
	}

}
