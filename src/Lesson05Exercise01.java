import java.util.Scanner;

public class Lesson05Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjangKakiSegitiga;
		
		System.out.println();
		System.out.print("Program membuat Segitiga sama kaki siku-siku\n\n");
		
		System.out.print("Panjang Kaki Segitiga (3 - 15): ");
        panjangKakiSegitiga = input.nextInt();
		
		if (panjangKakiSegitiga < 3 || panjangKakiSegitiga > 15)
		{
			System.out.print("Kaki Segitiga harus antara (3 - 15)\n\n");
		} else {
			System.out.println();
			// Membuat gambar segitiga.
			for (int i = 1; i <= panjangKakiSegitiga; i++) {
				// Membuat spasi sebelum karakter '*'.
				for (int j = 1; j <= panjangKakiSegitiga - i; j++) {
					System.out.print("  ");
				}
				
				// Mencetak karakter '*'.
				for (int k = 1; k <= i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println();

			input.close();
		}
    }
}
