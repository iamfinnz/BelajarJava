import java.util.Scanner;

public class Lesson05Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String arah = "";
		
		System.out.println();
		System.out.println("Program membuat Segitiga sama sisi\n");
        while (!arah.equalsIgnoreCase("u") && !arah.equalsIgnoreCase("t") && !arah.equalsIgnoreCase("b")) {
            System.out.print("Arah kerucut Segitiga [U]Atas, [T]Bawah, [B]Atas Bawah: ");
            arah = input.nextLine().toLowerCase();
            if (!arah.equalsIgnoreCase("u") && !arah.equalsIgnoreCase("t") && !arah.equalsIgnoreCase("b")) {
            }
        }
		
		int tinggi = 0;
		System.out.println();
		
		while (tinggi < 3 || tinggi > 15) {
			System.out.print("Tinggi Segitiga (3 - 15) : ");
			tinggi = input.nextInt();
			
			if (tinggi < 3 || tinggi > 15) {
				System.out.print("Tinggi segitiga harus antara (3 - 15)");
				System.out.println("\n");
            }
        }

        if (tinggi >= 3 && tinggi <= 15) {
            if (arah.equalsIgnoreCase("u")) {
				System.out.println();
                buatSegitigaAtas(tinggi);
            } else if (arah.equalsIgnoreCase("t")) {
				System.out.println();
                buatSegitigaBawah(tinggi);
            } else if (arah.equalsIgnoreCase("b")) {
				System.out.println();
                buatSegitigaAtasBawah(tinggi);
            }
        } else {
            System.out.println("Tinggi segitiga harus antara (3 - 15)\n\n");
        }

        input.close();
    }

    // Metode untuk membuat segitiga sama sisi dengan arah ke atas
    public static void buatSegitigaAtas(int tinggi) {
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Metode untuk membuat segitiga sama sisi dengan arah ke bawah
    public static void buatSegitigaBawah(int tinggi) {
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Metode untuk membuat segitiga sama sisi dengan arah ke atas dan bawah
    public static void buatSegitigaAtasBawah(int tinggi) {
        buatSegitigaAtas(tinggi);
        buatSegitigaBawah(tinggi);
    }
}
