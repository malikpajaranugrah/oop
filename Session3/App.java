public class App {
    public static void main(String[] args) {
        Circle Circle = new Circle("Circle", 4);
        System.out.println("Name: " + Circle.getname());
        System.out.println("Area: " + Circle.getarea());
        System.out.println("Perimeter: " + Circle.getperimeter() + "\n");

        Rectangle Rectangle = new Rectangle("Rectangle",4,2);
        System.out.println("Name: " + Rectangle.getname());
        System.out.println("Area: " + Rectangle.getarea());
        System.out.println("Perimeter: " + Rectangle.getperimeter() + "\n");
        
        EquilateralTA EquilateralTA = new EquilateralTA("Equilateral Triangle", 7);
        System.out.println("Name: " + EquilateralTA.getname());
        System.out.println("Area: " + EquilateralTA.calculatearea());
        System.out.println("Perimeter: " + EquilateralTA.calculateperimeter() + "\n");
        
        IsoscelesTA IsoscelesTA = new IsoscelesTA("Isosceles Triangle", 4, 2);
        System.out.println("Name: " + IsoscelesTA.getname());
        System.out.println("Area: " + IsoscelesTA.calculatearea());
        System.out.println("Perimeter: " + IsoscelesTA.calculateperimeter() + "\n");
        
        RightTA RightTA = new RightTA("Right Triangle",7,4,2);
        System.out.println("Name: " + RightTA.getname());
        System.out.println("Area: " + RightTA.calculatearea());
        System.out.println("Perimeter: " + RightTA.calculateperimeter() + "\n");
        
        AnyTA AnyTA = new AnyTA("Any Triangle",7,4,2);
        System.out.println("Name: " + AnyTA.getname());
        System.out.println("Area: " + AnyTA.calculatearea());
        System.out.println("Perimeter: " + AnyTA.calculateperimeter());   
    }  
}
