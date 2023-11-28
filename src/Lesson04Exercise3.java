import java.util.Scanner;

public class Lesson04Exercise3
{
	public static void main(String args[])
	{
		Scanner input =  new Scanner(System.in);
		
		char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x002F, 0x2500, 0x2518, 0x005F, 0x203E };
		
		System.out.print("\nProgram persamaan kuadrat");
		
		System.out.println("\n");
		
		System.out.printf("ax%c + bx + c = 0", ascii[1]);
		
		System.out.println();
		
		System.out.printf("\t   %c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("     -b + %c b%c - 4ac%n", ascii[0], ascii[1]);
		System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]
		, ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.print("\t   2a");
		
		System.out.println();
		
		System.out.printf("\t   %c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("     -b - %c b%c - 4ac%n", ascii[0], ascii[1]);
		System.out.printf("x2 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]
		, ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.print("\t   2a");				
		
		System.out.println("\n");
		
		System.out.println("Isi nilai a, b dan c");
		
		System.out.print("a: ");
		double a = input.nextDouble();
		
		System.out.print("b: ");
		double b = input.nextDouble();
		
		System.out.print("c: ");
		double c = input.nextDouble();
		
		
		System.out.printf("\t   %c%c%c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("\t     %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4]);
		System.out.printf("     -b + %c b%c - 4ac", ascii[0], ascii[1]);
		System.out.printf("   -%.0f + %c %.0f%c - 4 x %.0f x %.0f%n", b, ascii[0], b, ascii[1], a, c);
		System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4]);
		System.out.printf(" = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.print("\t   2a");
		System.out.printf("\t\t\t2 x %.0f%n", a);
		
		double discriminant = b * b - 4 * a * c;

        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        double root = -b / (2 * a);
		
		System.out.printf("x1 = %.2f%n%n", root1);
		
		System.out.printf("\t   %c%c%c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("\t     %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4]);
		System.out.printf("     -b - %c b%c - 4ac", ascii[0], ascii[1]);
		System.out.printf("   -%.0f - %c %.0f%c - 4 x %.0f x %.0f%n", b, ascii[0], b, ascii[1], a, c);
		System.out.printf("x2 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c", ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4]);
		System.out.printf(" = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], 
		ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.print("\t   2a");
		System.out.printf("\t\t\t2 x %.0f%n", a);
		System.out.printf("x2 = %.2f%n%n", root2);

	}
}