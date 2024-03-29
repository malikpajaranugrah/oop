package Geometri;

import Shape.Square;

public class Cube implements Geometri {
    private double sisi;

    public Cube(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double hitungLuasAlas() {
        return new Square(sisi).hitungLuas();
    }
}