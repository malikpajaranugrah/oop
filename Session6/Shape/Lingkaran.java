package Shape;

public class Circle implements Shape {
    private double jariJari;

    public Circle (double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}
