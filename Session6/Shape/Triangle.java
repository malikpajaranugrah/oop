package Shape;

public abstract class Triangle implements Shape {
    protected Shape alas;

    public Triangle(Shape alas) {
        this.alas = alas;
    }
}