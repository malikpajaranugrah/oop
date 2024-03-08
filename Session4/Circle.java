public class Circle extends Shape {

    protected Double radius;

    public Circle(Double radius, String name) {
        super.setName(name);
        this.radius = radius;
        this.calculateArea(radius);
        this.calculatePerimeter(radius);
    }

    public void calculateArea(Double radius) {
        super.area = Math.PI * Math.pow(radius, 2);
    }

    public void calculatePerimeter(Double radius) {
        super.perimeter = 2 * Math.PI * radius;
    }

    @Override
    public void getInfo() {
        System.out.println("\nCircle " + name + " info");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + super.area);
    }
}