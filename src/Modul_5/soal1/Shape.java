package Modul_5.soal1;

public abstract class Shape {
    protected String shapeName;

    Shape(String name) {
        this.shapeName = name;
    }

    protected abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }
}