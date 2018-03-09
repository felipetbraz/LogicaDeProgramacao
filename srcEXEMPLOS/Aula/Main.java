package Aula;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int x;
		int y;
		for (x = 0; x < 500000; x++){
			for (y = 0; y < 500000; y++){
				System.out.println ("5");
			}
		}
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = B + (0.15 * C);

		System.out.printf("TOTAL = R$ %.2f\n",D);
		sc.close();
	}

}