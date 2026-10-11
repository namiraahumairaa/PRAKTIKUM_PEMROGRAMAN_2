package Modul_3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt()) {
            System.out.println("Error: Jumlah dadu harus berupa angka.");
            input.close();
            return;
        }
        int jumlahDadu = input.nextInt();

        if (jumlahDadu <= 0) {
            System.out.println("Error: Jumlah dadu harus lebih dari 0.");
        } else {
            LinkedList<Dadu> daftarDadu = new LinkedList<>();
            for (int i = 0; i < jumlahDadu; i++) {
                daftarDadu.add(new Dadu());
            }

            int totalNilai = 0;
            int urutan = 1;
            for (Dadu dadu : daftarDadu) {
                System.out.println("Dadu ke-" + urutan + " bernilai " + dadu.getNilai());
                totalNilai += dadu.getNilai();
                urutan++;
            }
            System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        }
        input.close();
    }
}