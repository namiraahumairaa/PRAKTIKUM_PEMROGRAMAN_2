package Modul_3.soal1;

import java.util.Random;

public class Dadu {
    private static final Random RANDOM = new Random();

    private int nilai;

    public Dadu() {
        acakNilai();
    }

    private void acakNilai() {
        this.nilai = RANDOM.nextInt(6) + 1;
    }

    public int getNilai() {
        return this.nilai;
    }
}