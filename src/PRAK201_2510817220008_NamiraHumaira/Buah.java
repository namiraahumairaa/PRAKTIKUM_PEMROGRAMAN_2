package PRAK201_2510817220008_NamiraHumaira;

import java.util.Locale;

public class Buah {
    private String namaBuah;
    private double berat;
    private double harga;
    private double jumlahBeli;

    private static final double BERAT_PER_DISKON = 4;
    private static final double PERSEN_DISKON = 0.02;

    public Buah(String namaBuah, double berat, double harga, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    private double hitungHargaPerKg() {
        return this.harga / this.berat;
    }

    private double hitungHargaSebelumDiskon() {
        return this.jumlahBeli * hitungHargaPerKg();
    }

    private double hitungTotalDiskon() {
        int jumlahPaket = (int) (this.jumlahBeli / BERAT_PER_DISKON);
        double hargaPerPaket = BERAT_PER_DISKON * hitungHargaPerKg();
        double totalDiskon = 0;

        for (int i = 1; i <= jumlahPaket; i++) {
            totalDiskon += hargaPerPaket * PERSEN_DISKON;
        }
        return totalDiskon;
    }

    private double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Buah: " + this.namaBuah);
        System.out.println("Berat: " + this.berat);
        System.out.println("Harga: " + this.harga);
        System.out.println("Jumlah Beli: " + this.jumlahBeli + "kg");
        System.out.printf(Locale.US, "Harga Sebelum Diskon: Rp%.2f\n", hitungHargaSebelumDiskon());
        System.out.printf(Locale.US, "Total Diskon: Rp%.2f\n", hitungTotalDiskon());
        System.out.printf(Locale.US, "Harga Setelah Diskon: Rp%.2f\n\n", hitungHargaSetelahDiskon());
    }
}