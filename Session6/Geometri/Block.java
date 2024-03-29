package Geometri;
import Shape.Rectangle;

public class Block implements Geometri {
    private Rectangle alas;
    private double tinggi;

    public Block(double panjang, double lebar, double tinggi) {
        this.alas = new Rectangle(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return alas.hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasAlas() {
        return alas.hitungLuas();
    }
}