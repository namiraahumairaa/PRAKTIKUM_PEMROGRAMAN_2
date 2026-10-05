package Modul_2.PRAK203_2510817220008_NamiraHumaira;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        //Pada baris ini terjadi error karena kurangnya titik koma (;)
        //p1.nama = "Roi"
        p1.nama = "Roi";

        //Pada baris ini sebenarnya ikut error karena asal bertipe char tidak bisa diisi String. Error hilang setelah asal di Pegawai diubah menjadi String
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        //Pada baris ini umur belum diisi sehingga bernilai default 0, padahal output yang diminta 17. Perlu ditambahkan nilainya
        p1.umur = 17;

        //Pada baris ini label "Nama Pegawai" tidak sesuai output soal, seharusnya "Nama" saja
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());

        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        //Pada baris ini output belum menampilkan satuan "tahun" setelah umur sesuai output soal
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}