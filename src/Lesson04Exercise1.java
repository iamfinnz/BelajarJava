import java.util.Scanner;

public class Lesson04Exercise1
{
	public static void main(String args[])
	{
		Scanner input =  new Scanner(System.in);
		
		System.out.println("\nProgram menghitung Keliling dan Luas Persegi Panjang\n");
		
		/* Gambar persegi panjang */
		char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2514, 0x2518 };
		
		System.out.printf("\t%c%c", ascii[3], ascii[4]);
		System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("%c", ascii[5]);
		System.out.printf("%n\t%c", ascii[2]);
		System.out.printf("\t\t%c", ascii[2]);
		System.out.printf("%n\t%c", ascii[2]);
		System.out.printf("\t\t%c", ascii[2]);
		System.out.printf("  l");
		System.out.printf("%n\t%c", ascii[2]);
		System.out.printf("\t\t%c", ascii[2]);
		System.out.printf("%n\t%c", ascii[6]);
		System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("%c", ascii[7]);
		System.out.println();
		System.out.println("\t\tp");

		System.out.println("\n");

		System.out.print("Sisi panjang (p): ");
		double panjang = input.nextDouble();
		
		System.out.print("Sisi lebar   (l): ");
		double lebar = input.nextDouble();
		
		double luas = panjang * lebar;
		double keliling = 2 * (panjang + lebar);
		
		System.out.println("");
		
		System.out.println("Keliling persegi panjang");
		System.out.println("= 2 x (p + l)");
		System.out.printf("= 2 x (%.0f + %.0f)%n", panjang, lebar);
		System.out.printf("= %.0f cm", keliling);
		
		System.out.println("\n");

		System.out.println("Luas persegi panjang");
		System.out.println("= p x l");
		System.out.printf("= %.0f x %.0f%n", panjang, lebar);
		System.out.printf("= %.0f cm persegi", luas);
		
		System.out.println("\n");
		
		input.close();
	}
}				