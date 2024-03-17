public class Rectangle extends Shape{
    
    public Rectangle(String name, double length, double width){
        super(name);
        calculateperimeter(length, width);
        calculatearea(length, width);
    }

    public void calculateperimeter(double length, double width){
        perimeter = 2 * (length + width);
        
    }

    public void calculatearea(double length, double width){
        area = length * width;
    }
}