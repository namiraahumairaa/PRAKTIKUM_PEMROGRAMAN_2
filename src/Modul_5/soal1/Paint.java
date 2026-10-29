package Modul_5.soal1;

public class Paint {
    private double coverage;

    public Paint (double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        double needed = Math.ceil(s.area() / coverage);
        return needed;
    }
}