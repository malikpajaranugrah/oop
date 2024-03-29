package Shape;

public class Triangle_SameFoot extends Triangle {
    private double tinggi;

    public Triangle_SameFoot(Shape alas, double tinggi) {
        super(alas);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas.hitungLuas() * tinggi;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(2 * alas.hitungLuas() / tinggi);
        return 2 * alas.hitungKeliling() + sisiMiring;
    }
}