package Modul_1;
import java.util.Scanner;

public class PRAK101_2510817220008_NamiraHumaira {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = scan.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scan.nextLine();

        int tanggalLahir = 0, bulanLahir = 0, tahunLahir = 0;
        boolean tanggalValid = false;

        // Validasi Strict Tanggal, Bulan, Tahun
        System.out.println("\n--- Masukkan Data Kelahiran ---");
        do {
            System.out.print("Masukkan Tanggal Lahir: ");
            while (!scan.hasNextInt()) { // Validasi tipe data (harus angka)
                System.out.println("Error: Input harus berupa angka!");
                scan.next();
                System.out.print("Masukkan Tanggal Lahir: ");
            }
            tanggalLahir = scan.nextInt();

            System.out.print("Masukkan Bulan Lahir: ");
            while (!scan.hasNextInt()) {
                System.out.println("Error: Input harus berupa angka!");
                scan.next();
                System.out.print("Masukkan Bulan Lahir: ");
            }
            bulanLahir = scan.nextInt();

            System.out.print("Masukkan Tahun Lahir: ");
            while (!scan.hasNextInt()) {
                System.out.println("Error: Input harus berupa angka!");
                scan.next();
                System.out.print("Masukkan Tahun Lahir: ");
            }
            tahunLahir = scan.nextInt();

            // Pengecekan Batas Hari & Tahun Kabisat
            int batasHari = 31; // Default bulan maksimal 31 hari
            if (bulanLahir == 4 || bulanLahir == 6 || bulanLahir == 9 || bulanLahir == 11) {
                batasHari = 30;
            } else if (bulanLahir == 2) {
                // Syarat Leap Year
                boolean isKabisat = (tahunLahir % 4 == 0 && tahunLahir % 100 != 0) || (tahunLahir % 400 == 0);
                batasHari = isKabisat ? 29 : 28;
            }

            // Rentang Waktu
            if (bulanLahir < 1 || bulanLahir > 12) {
                System.out.println("Bulan tidak valid! Silakan isi (1-12).\n");
            } else if (tanggalLahir < 1 || tanggalLahir > batasHari) {
                System.out.println("Tanggal tidak valid! Bulan " + bulanLahir + " di tahun " + tahunLahir + " hanya memiliki " + batasHari + " hari.\n");
            } else {
                tanggalValid = true; // Jika semua benar, keluar dari loop
            }
        } while (!tanggalValid);

        // Tinggi Badan
        int tinggiBadan = 0;
        do {
            System.out.print("Masukkan Tinggi Badan (cm): ");
            while (!scan.hasNextInt()) {
                System.out.println("Error: Input harus berupa angka bulat!");
                scan.next();
                System.out.print("Masukkan Tinggi Badan (cm): ");
            }
            tinggiBadan = scan.nextInt();
            if (tinggiBadan <= 0) System.out.println("Tinggi badan tidak valid!");
        } while (tinggiBadan <= 0);

        // Berat Badan
        double beratBadan = 0;
        do {
            System.out.print("Masukkan Berat Badan (kg): ");
            while (!scan.hasNextDouble()) {
                System.out.println("Error: Input harus berupa angka (bisa desimal)!");
                scan.next();
                System.out.print("Masukkan Berat Badan (kg): ");
            }
            beratBadan = scan.nextDouble();
            if (beratBadan <= 0) System.out.println("Berat badan tidak valid!");
        } while (beratBadan <= 0);

        String[] namaBulanArray = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        String namaBulan = namaBulanArray[bulanLahir - 1];

        System.out.println("\n--- Output ---");
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulan + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");

        scan.close();
    }
}