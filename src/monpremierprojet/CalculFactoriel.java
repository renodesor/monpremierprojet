package monpremierprojet;

import java.util.Scanner;

public class CalculFactoriel {

	public static void main(String[] args) {
		System.out.println("Veuillez entrer un nombre entier :");
		Scanner scanner = new Scanner(System.in);
		try {
			int n = scanner.nextInt();
			if(n > 0) {
				System.out.println(getFactoriel(n));
			} else {
				System.out.println("Il faut saisir un nombre entier positif.");
			}
			
		} catch(Exception ex) {
			System.out.println("La valeur saisie n'est pas un entier.");
		} finally {
			scanner.close();
		}

	}
	
	public static int getFactoriel(int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		
		return result;
	}

}
