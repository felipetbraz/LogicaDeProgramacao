package Aula;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String A = sc.nextString();
	double B = sc.nextDouble();
	double C = sc.nextDouble();
	double TOTAL = B + (0.15 * C) ;
	
	System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
	sc.close();
  }
  
}
