public class Triangle extends Shape {
    private double sideA;
    private double sideB; // Base
    private double sideC; 

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;  
        this.sideB = sideB;  
        this.sideC = sideC;
    }

    @Override
    public double calculatearea() {
        double height = Math.sqrt(Math.pow(sideB,2) - Math.pow(sideC/2, 2));
        double area = 0.5 * sideB * height;
        return area;
    }

    @Override
    public double calculateperimeter() {
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    public double getsideA(){
        return sideA;
    }

    public double getsideC(){
        return sideC;
    }

    public double getsideB(){
        return sideB;
    }
}