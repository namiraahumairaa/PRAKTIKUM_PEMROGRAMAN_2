package Modul_3.soal2;

import java.util.HashMap;

public class Negara {
    private static final HashMap<Integer, String> NAMA_BULAN = new HashMap<>();

    static {
        NAMA_BULAN.put(1, "Januari");
        NAMA_BULAN.put(2, "Februari");
        NAMA_BULAN.put(3, "Maret");
        NAMA_BULAN.put(4, "April");
        NAMA_BULAN.put(5, "Mei");
        NAMA_BULAN.put(6, "Juni");
        NAMA_BULAN.put(7, "Juli");
        NAMA_BULAN.put(8, "Agustus");
        NAMA_BULAN.put(9, "September");
        NAMA_BULAN.put(10, "Oktober");
        NAMA_BULAN.put(11, "November");
        NAMA_BULAN.put(12, "Desember");
    }

    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin,
                  int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this(nama, jenisKepemimpinan, namaPemimpin, 0, 0, 0);
    }

    public void info() {
        String sebutanPemimpin;

        switch (this.jenisKepemimpinan.toLowerCase()) {
            case "presiden":
                sebutanPemimpin = "Presiden";
                break;
            case "perdana menteri":
                sebutanPemimpin = "Perdana Menteri";
                break;
            case "monarki":
                sebutanPemimpin = "Raja";
                break;
            default:
                sebutanPemimpin = this.jenisKepemimpinan;
                break;
        }

        System.out.println("Negara " + this.nama + " mempunyai " + sebutanPemimpin
                + " bernama " + this.namaPemimpin);

        if (!this.jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + this.tanggalKemerdekaan
                    + " " + NAMA_BULAN.get(this.bulanKemerdekaan) + " " + this.tahunKemerdekaan);
        }
        System.out.println();
    }
}