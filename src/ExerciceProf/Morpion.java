package ExerciceProf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Morpion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer indent = 1;
		String[] position = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		CreationMorpion(position);
		
	}
	
	public static void CreationMorpion(String[] tab) {
		System.out.print(tab[0]);
		System.out.print(" ");
		System.out.print(tab[1]);
		System.out.print(" ");
		System.out.println(tab[2]);
		System.out.print(tab[3]);
		System.out.print(" ");
		System.out.print(tab[4]);
		System.out.print(" ");
		System.out.println(tab[5]);
		System.out.print(tab[6]);
		System.out.print(" ");
		System.out.print(tab[7]);
		System.out.print(" ");
		System.out.print(tab[8]);
		
	}
	//condition pour gagner / update mopion/ check position de l'utilisateur si c'est possible fonction recursive 

}
