package Proekt2;

import java.util.Scanner;

public class Kruznica {

	public static void main(String[] args) {
		double R ,plostina,perimetar;
		Scanner tastatura = new Scanner(System.in);
	System.out.println("Programata presmetuva plostina i perimetar na kruznica ");
		System.out.println("Vnesete go radiusot na kruznicata: ");
		R = tastatura.nextDouble();
		
		plostina = R * R * 3.14;
		perimetar = 2 * R * 3.14;
		
		System.out.println();
		System.out.println("Plostinata na kruznicata e: " + plostina);
		System.out.println("Perimetarot na kruzincata e: " + perimetar );
		

	}

}
