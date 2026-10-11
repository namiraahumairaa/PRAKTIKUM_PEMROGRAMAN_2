package Modul_3.soal3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal3Main {

    public static void main(String[] args) {
        // menyimpan semua mahasiswa sesuai urutan input
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        // untuk pencarian langsung tanpa loop
        HashMap<String, Mahasiswa> indeksNim = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int pilihan = -1;

        while (pilihan != 0) {
            tampilkanMenu();
            try {
                System.out.print("Pilihan: ");
                pilihan = scan.nextInt();
                scan.nextLine();

                switch (pilihan) {
                    case 1:
                        tambahMahasiswa(scan, daftarMahasiswa, indeksNim);
                        break;
                    case 2:
                        hapusMahasiswa(scan, daftarMahasiswa, indeksNim);
                        break;
                    case 3:
                        cariMahasiswa(scan, indeksNim);
                        break;
                    case 4:
                        tampilkanDaftarMahasiswa(daftarMahasiswa);
                        break;
                    case 0:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scan.nextLine();
                pilihan = -1;
            }
            System.out.println();
        }
        scan.close();
    }

    private static void tampilkanMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
        System.out.println("3. Cari Mahasiswa berdasarkan NIM");
        System.out.println("4. Tampilkan Daftar Mahasiswa");
        System.out.println("0. Keluar");
    }

    // Create
    private static void tambahMahasiswa(Scanner scan, ArrayList<Mahasiswa> daftar,
                                        HashMap<String, Mahasiswa> indeksNim) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scan.nextLine().trim();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String nim = scan.nextLine().trim();

        if (nama.isEmpty() || nim.isEmpty()) {
            System.out.println("Nama dan NIM tidak boleh kosong.");
            return;
        }

        // mengecek NIM kembar
        if (indeksNim.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar. Mahasiswa tidak dapat ditambahkan.");
            return;
        }

        Mahasiswa baru = new Mahasiswa(nama, nim);
        daftar.add(baru);
        indeksNim.put(nim, baru);
        System.out.println("Mahasiswa " + nama + " ditambahkan.");
    }

    // Delete
    private static void hapusMahasiswa(Scanner scan, ArrayList<Mahasiswa> daftar,
                                       HashMap<String, Mahasiswa> indeksNim) {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nim = scan.nextLine().trim();

        // jika NIM tidak ada
        Mahasiswa yangDihapus = indeksNim.remove(nim);

        if (yangDihapus != null) {
            daftar.remove(yangDihapus);
            System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
        }
    }

    // satu data
    private static void cariMahasiswa(Scanner scan, HashMap<String, Mahasiswa> indeksNim) {
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        String nim = scan.nextLine().trim();

        Mahasiswa mhs = indeksNim.get(nim);
        if (mhs != null) {
            System.out.println("Data Mahasiswa Ditemukan:");
            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    // semua data
    private static void tampilkanDaftarMahasiswa(ArrayList<Mahasiswa> daftar) {
        if (daftar.isEmpty()) {
            System.out.println("Daftar Mahasiswa kosong.");
            return;
        }

        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : daftar) {
            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
        }
    }
}