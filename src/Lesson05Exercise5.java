import java.util.Scanner;

public class Lesson05Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
		char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x002F, 0x2500, 0x2518, 0x005F, 0x203E };
		
		System.out.println();
		System.out.println("Program persamaan kaudrat\n");
		System.out.println("Rumus");
		System.out.println("-----");
		System.out.printf("ax%c + bx + c = 0%n%n", ascii[1]);
		
		System.out.println("Syarat");
		System.out.println("------");
		System.out.println("a <> 0");
		System.out.printf("b%c - 4ac >= 0%n%n", ascii[1]);
		
		System.out.println("Hasil");
		System.out.println("-----");
		
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
		System.out.println("--------------------");
		
        do {
			System.out.print("a: ");
            a = input.nextDouble();

            if (a == 0) {
                System.out.println("a tidak boleh = 0\n");
            }
        } while (a == 0);

        System.out.print("b: ");
        double b = input.nextDouble();

        System.out.print("c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.printf("Persamaan tidak memiliki hasil karena b%c - 4ac < 0%n%n", ascii[1]);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Akar-akar persamaan kuadrat adalah x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
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
			System.out.printf("x1 = %.2f%n%n", x1);
			
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
			System.out.printf("x2 = %.2f%n%n", x2);
        }
    }
}
