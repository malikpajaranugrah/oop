public class Circle extends Shape{
    public Circle(String name, double radius){
        super(name);
        calculateperimeter(radius);
        calculatearea(radius);
    }

    public void calculateperimeter(double radius){
        perimeter = 2 * Math.PI * radius;
    }

    public void calculatearea(double radius){
        area = Math.PI * radius * radius;

    }
}