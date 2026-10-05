package Modul_2.PRAK203_2510817220008_NamiraHumaira;

//Pada baris ini terjadi error karena nama class (Employee) tidak sama dengan nama file (Pegawai.java). Class public wajib identik dengan nama filenya
//public class Employee {
public class Pegawai {
    public String nama;

    //Pada baris ini terjadi error karena tipe char hanya bisa menampung 1 karakter, sedangkan asal berisi teks "Kingdom of Orvel". Seharusnya String
    //public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    //Pada baris di bawah ini sebenarnya ikut error karena asal bertipe char sedangkan return type String (incompatible types). Error hilang setelah asal diubah menjadi String
    public String getAsal() {
        return asal;
    }

    //Pada baris ini terjadi error karena method tidak punya parameter, sehingga variabel j tidak dikenal dan tidak cocok dengan pemanggilan setJabatan("Assasin") di main
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}