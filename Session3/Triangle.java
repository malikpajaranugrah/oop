public class Triangle extends Shape{
    protected double hypotenuseA;
    protected double hypotenuseB;
    protected double base;
    protected double height;
 
    public void calculateArea(double base, double height){
        this.base = base;
        this.height = height;
    }
}
