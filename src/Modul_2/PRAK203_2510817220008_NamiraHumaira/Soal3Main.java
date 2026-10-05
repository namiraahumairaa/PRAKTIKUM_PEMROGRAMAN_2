package Modul_2.PRAK203_2510817220008_NamiraHumaira;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Error: kurang tanda titik koma (;) di akhir statement
        // p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        // Error: umur belum diisi sehingga bernilai default 0,
        // padahal output yang diminta 17. Perlu diberi nilai.
        p1.umur = 17;

        // Error: label "Nama Pegawai" tidak sesuai output soal.
        // Seharusnya "Nama" saja.
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());

        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Error: output soal meminta satuan "tahun" setelah umur.
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}