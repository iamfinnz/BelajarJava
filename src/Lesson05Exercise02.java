import java.util.Scanner;

public class Lesson05Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tinggi;
		
		System.out.println();
		System.out.print("Program membuat Segitiga sama sisi\n\n");
		
		System.out.print("Tinggi Segitiga (3 - 15): ");
        tinggi = input.nextInt();
		System.out.println();
		
		if (tinggi >= 3 && tinggi <= 15) {
            for (int i = 1; i <= tinggi; i++) {
                // Cetak spasi untuk membuat tampilan segitiga
                for (int j = 1; j <= tinggi - i; j++) {
                    System.out.print(" ");
                }

                // Cetak bintang (*) untuk setiap baris
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
			
                System.out.println(); // Pindah ke baris berikutnya
            }
			System.out.println();
        } else {
			System.out.println();
            System.out.println("Tinggi segitiga harus antara (3 - 15)\n");
        }

        input.close();
    }
}