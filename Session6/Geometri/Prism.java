package Geometri;
import Shape.Triangle;

public class Prism implements Geometri {
    private Triangle alas;
    private double tinggi;

    public Prism(Triangle alas, double tinggi) {
        this.alas = alas;
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