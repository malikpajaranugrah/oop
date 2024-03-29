package Geometri;

import Shape.Circle;

public class Cylinder implements Geometri {
    private double jariJari;
    private double tinggi;

    public Cylinder(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return new Circle(jariJari).hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasAlas() {
        return new Circle(jariJari).hitungLuas();
    }
}