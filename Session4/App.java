public class App {
    public static void main(String[] args) throws Exception {
        RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
        Triangle BCD = new RightTriangle("BCD", 3.0, 4.0); 
        Triangle CDE = new Triangle("CDE", 3.0, 4.0, 5.0);

        SameFootTriangle SameFootTriangle = new SameFootTriangle("same foot", 5.0,10.0);

        SameSideTriangle SameSideTriangle = new SameSideTriangle("same side", 10.0);

        Rectangle rectangle = new Rectangle("rectangle", 10.0,5.0);

        Circle circle = new Circle (4.0, "circle");

        ABC.getInfo();
        BCD.getInfo();
        CDE.getInfo();

        SameFootTriangle.getInfo();
        SameSideTriangle.getInfo();
        rectangle.getInfo();
        circle.getInfo();
    }
}
