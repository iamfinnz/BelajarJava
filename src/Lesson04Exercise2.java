import java.util.Scanner;

public class Lesson04Exercise2
{
	public static void main(String args[])
	{
		Scanner input =  new Scanner(System.in);
		
		/* Gambar persegi panjang */
		char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x002F, 0x2500, 0x2518, 0x005F, 0x203E };
		
		System.out.println("\nProgram menghitung sisi miring segitiga Siku-siku (Pythagoras)\n");

		System.out.printf("       %c%c%n", ascii[3], ascii[2]);
		System.out.printf("      %c %c%n", ascii[3], ascii[2]);
		System.out.printf("     %c  %c%n", ascii[3], ascii[2]);
		System.out.printf(" c  %c   %c  b%n", ascii[3], ascii[2]);
		System.out.printf("   %c    %c%n", ascii[3], ascii[2]);
		System.out.printf("  %c     %c%n", ascii[3], ascii[2]);
		System.out.printf("  %c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[5]);
		System.out.printf("%n     a%n");
		
		System.out.printf("     %c%c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4]);
		System.out.printf("%nc = %c a%c + b%c", ascii[0], ascii[1], ascii[1]);
		System.out.printf("%na = Sisi datar%n");
		System.out.printf("b = Sisi tegak%n");
		System.out.printf("c = Sisi miring%n");
		
		System.out.println();
		
		System.out.print("Sisi datar: ");
		double datar = input.nextDouble();
		
		System.out.print("Sisi tegak: ");
		double tegak = input.nextDouble();
		
		// Menghitung sisi miring menggunakan teorema Pythagoras
        double sisiMiring = Math.sqrt(Math.pow(datar, 2) + Math.pow(tegak, 2));
		
		System.out.println("Sisi miring\n");
		
		System.out.printf("     %c%c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4]);
		System.out.printf("%nc = %c a%c + b%c", ascii[0], ascii[1], ascii[1]);
		System.out.println();
		System.out.printf("     %c%c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4]);
		System.out.printf("%nc = %c %.0f%c + %.0f%c", ascii[0], datar, ascii[1], tegak, ascii[1]);
		System.out.printf("%nc = %.2f%n", sisiMiring);

		System.out.println();
	}
}