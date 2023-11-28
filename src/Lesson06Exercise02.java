import java.util.*;

public class Lesson06Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Program mengelola nilai Siswa\n");

        System.out.print("Nama siswa: ");
        String namaSiswa = input.nextLine();

        System.out.print("Jumlah pelajaran: ");
        int jumlahPelajaran = input.nextInt();
		
		System.out.println();

        // Membuat ArrayList untuk menyimpan nama pelajaran dan nilai ujian
        List<String> namaPelajaran = new ArrayList<>();
        List<Double> nilaiUjian = new ArrayList<>();

        for (int i = 0; i < jumlahPelajaran; i++) {
            input.nextLine(); // Membersihkan newline
            System.out.print("Pelajaran ke-" + (i + 1));
			System.out.println();
			System.out.print("Nama: ");
            String namaPelajaranInput = input.nextLine();
            namaPelajaran.add(namaPelajaranInput);

            System.out.print("Nilai: ");
            double nilaiUjianInput = input.nextDouble();
            nilaiUjian.add(nilaiUjianInput);
			System.out.println();
        }

        // Mengurutkan pelajaran berdasarkan nilai secara descending
        for (int i = 0; i < jumlahPelajaran - 1; i++) {
            for (int j = i + 1; j < jumlahPelajaran; j++) {
                if (nilaiUjian.get(i) < nilaiUjian.get(j)) {
                    // Menukar posisi nama pelajaran
                    String tempNamaPelajaran = namaPelajaran.get(i);
                    namaPelajaran.set(i, namaPelajaran.get(j));
                    namaPelajaran.set(j, tempNamaPelajaran);

                    // Menukar posisi nilai ujian
                    double tempNilaiUjian = nilaiUjian.get(i);
                    nilaiUjian.set(i, nilaiUjian.get(j));
                    nilaiUjian.set(j, tempNilaiUjian);
                }
            }
        }
		
		System.out.println("Informasi Nilai Siswa");
        System.out.println("Nama Siswa: " + namaSiswa);
		System.out.println();
		System.out.println("Hasil ujian pelajaran siswa di urutkan berdasarkan nilai tertinggi:");
		System.out.println("No  Pelajaran       Nilai");
		System.out.println("=========================");
		// Menampilkan hasil nilai pelajaran
        for (int i = 0; i < jumlahPelajaran; i++) {
			System.out.printf(" %2d %-15s %.0f%n", (i + 1), namaPelajaran.get(i), nilaiUjian.get(i));
        }
		System.out.println("=========================\n");
        input.close();
    }
}
