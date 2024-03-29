package Shape;

public class Triangle_SameSide extends Triangle {
    private double sisi;

    public Triangle_SameSide
(double sisi) {
        super(null);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return (Math.sqrt(3) / 4) * sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 3 * sisi;
    }
}