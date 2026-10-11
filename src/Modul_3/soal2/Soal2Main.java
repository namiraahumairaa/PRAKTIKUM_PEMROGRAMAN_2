package Modul_3.soal2;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    private static boolean isJenisValid(String jenis) {
        return jenis.equalsIgnoreCase("presiden")
                || jenis.equalsIgnoreCase("monarki")
                || jenis.equalsIgnoreCase("perdana menteri");
    }

    // Mengecek apakah kombinasi tanggal, bulan, dan tahun masuk akal
    private static boolean isValidDate(int tanggal, int bulan, int tahun) {
        if (bulan < 1 || bulan > 12 || tanggal < 1 || tahun <= 0
                || tahun > Year.now().getValue()) {
            return false;
        }

        int maxHari;
        if (bulan == 2) {
            // tahun kabisat
            boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
            maxHari = kabisat ? 29 : 28;
        } else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            maxHari = 30;
        } else {
            maxHari = 31;
        }

        return tanggal <= maxHari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();

        //input pertama
        int jumlahNegara;
        while (true) {
            try {
                jumlahNegara = input.nextInt();
                input.nextLine();
                if (jumlahNegara > 0) {
                    break;
                }
                System.out.println("Jumlah negara harus lebih dari 0. Silakan coba lagi.");
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan sebuah angka.");
                input.nextLine();
            }
        }

        // input data tiap negara
        for (int i = 0; i < jumlahNegara; i++) {
            String nama = input.nextLine().trim();
            String jenisKepemimpinan = input.nextLine().trim();
            while (!isJenisValid(jenisKepemimpinan)) {
                System.out.println("Jenis kepemimpinan harus presiden, monarki, atau perdana menteri.");
                jenisKepemimpinan = input.nextLine().trim();
            }
            String namaPemimpin = input.nextLine().trim();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                // Monarki tidak menginputkan tanggal kemerdekaan
                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
            } else {
                int tanggal, bulan, tahun;
                while (true) {
                    try {
                        tanggal = input.nextInt();
                        bulan = input.nextInt();
                        tahun = input.nextInt();
                        input.nextLine();

                        if (isValidDate(tanggal, bulan, tahun)) {
                            break;
                        }
                        System.out.println("Tanggal/bulan/tahun tidak valid. Silakan masukkan kembali.");
                    } catch (InputMismatchException e) {
                        System.out.println("Tanggal, bulan, dan tahun harus berupa angka. Silakan masukkan kembali.");
                        input.nextLine();
                    }
                }
                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
            }
        }

        // Output detail setiap negara
        for (Negara negara : daftarNegara) {
            negara.info();
        }
        input.close();
    }
}