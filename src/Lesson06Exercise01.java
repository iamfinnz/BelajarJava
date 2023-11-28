import java.util.Scanner;

public class Lesson06Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.print("Program mengurutkan nama Siswa\n\n");
		
        System.out.print("Jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline

        String[] namaSiswa = new String[jumlahSiswa];
		
		System.out.println();

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = scanner.nextLine();
        }

        // Mengurutkan nama siswa
        for (int i = 0; i < jumlahSiswa - 1; i++) {
            for (int j = i + 1; j < jumlahSiswa; j++) {
                if (namaSiswa[i].compareToIgnoreCase(namaSiswa[j]) > 0) {
                    String temp = namaSiswa[i];
                    namaSiswa[i] = namaSiswa[j];
                    namaSiswa[j] = temp;
                }
            }
        }
		
		System.out.println();

        System.out.println("Nama siswa di urutkan berdasarkan abjad adalah:");

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println((i + 1)+". "+namaSiswa[i]);
        }
		System.out.println();
    }
}
