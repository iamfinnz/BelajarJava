import java.util.Scanner;

public class Lesson05Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.println();
        System.out.println("Program membuat Segitiga sama kaki siku-siku\n");
		String sisiTegak = "";
		
		while (!sisiTegak.equalsIgnoreCase("l") && !sisiTegak.equalsIgnoreCase("r")) {
            System.out.print("Sisi tegak rata [L]Kiri, [R]Kanan: ");
            sisiTegak = input.nextLine();

            if (!sisiTegak.equalsIgnoreCase("l") && !sisiTegak.equalsIgnoreCase("r")) {
                System.out.print("Sisi tegak rata [L]Kiri, [R]Kanan: ");
				sisiTegak = input.nextLine();
            }
        }

        int panjangKaki = 0;
		
		System.out.println();

        while (panjangKaki < 3 || panjangKaki > 15) {
            System.out.print("Panjang Kaki Segitiga (3 - 15) : ");
            panjangKaki = input.nextInt();

            if (panjangKaki < 3 || panjangKaki > 15) {
				System.out.print("Kaki Segitiga harus antara (3 - 15)");
				System.out.println("\n");
            }
        }

        if (sisiTegak.equalsIgnoreCase("l")) {
			System.out.println();
            for (int i = 1; i <= panjangKaki; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
			System.out.println();
            for (int i = panjangKaki; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                for (int k = panjangKaki; k >= i; k--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
		
		System.out.println();

        input.close();
    }
}
