import Shape.*;
import Geometri.*;

public class App {
    public static void main(String[] args) {
        Shape Rectangle = new Rectangle(4, 2);
        System.out.println("Parameter of Rectangle: " + Rectangle.hitungKeliling());
        System.out.println("Area of Rectangle: " + Rectangle.hitungLuas());
        System.out.println();

        Shape Circle = new Circle(4);
        System.out.println("Parameter of Circle: " + Circle.hitungKeliling());
        System.out.println("Area of Circle: " + Circle.hitungLuas());
        System.out.println();

        Geometri Cube = new Cube(4);
        System.out.println("Volume of Cube: " + Cube.hitungVolume());
        System.out.println("Area of Alas Cube: " + Cube.hitungLuasAlas());
        System.out.println();

        Shape Triangle_SameFoot = new Triangle_SameFoot(new Rectangle(2, 4), 6);
        Geometri Prism_SameFoot = new Prism((Triangle) Triangle_SameFoot, 5);
        System.out.println("Volume of Prism with same foot triangle base: " + Prism_SameFoot.hitungVolume());
        System.out.println("Area of Alas Prism with same foot triangle base: " + Prism_SameFoot.hitungLuasAlas());
        System.out.println("Parameter of Alas Prism with same foot triangle base: " + Triangle_SameFoot.hitungKeliling());
        System.out.println();

        Shape Triangle_SameSide = new Triangle_SameSide(4);
        Geometri Prism_SameSide = new Prism((Triangle) Triangle_SameSide, 6);
        System.out.println("Volume of Prism with same side triangle base: " + Prism_SameSide.hitungVolume());
        System.out.println("Area of Alas Prism with same side triangle base: " + Prism_SameSide.hitungLuasAlas());
        System.out.println("Parameter of Alas Prism with same side triangle base: " + Triangle_SameSide.hitungKeliling());
        System.out.println();

        Shape Triangle_Right = new Triangle_Right(6, 4, 2);
        Geometri Prism_Right = new Prism((Triangle) Triangle_Right, 6);
        System.out.println("Volume of Prism with right triangle base: " + Prism_Right.hitungVolume());
        System.out.println("Area of Alas Prism with right triangle base: " + Prism_Right.hitungLuasAlas());
        System.out.println("Parameter of Alas Prism with right triangle base: " + Triangle_Right.hitungKeliling());
        System.out.println();

        Shape Triangle_Right = new Triangle_Right(new Rectangle (3, 4), 5);
        Geometri prismaSikuSiku = new Prism((Triangle) Triangle_Right, 5);
        System.out.println("Volume Prisma dengan alas segitiga siku-siku: " + prismaSikuSiku.hitungVolume());
        System.out.println("Luas Alas Prisma dengan alas segitiga siku-siku: " + prismaSikuSiku.hitungLuasAlas());
        System.out.println("Keliling Alas Prisma dengan alas segitiga siku-siku: " + Triangle_Right.hitungKeliling());
        System.out.println();

        Shape Triangle_Any = new Triangle_Any(3, 4, 5);
        Geometri Prism_Any = new Prism((Triangle) Triangle_Any, 6);
        System.out.println("Volume of Prism with any triangle base : " + Prism_Any.hitungVolume());
        System.out.println("Area of Alas Prism with any triangle base : " + Prism_Any.hitungLuasAlas());
        System.out.println("Parameter of Alas Prism with any triangle base : " + Triangle_Any.hitungKeliling());
        System.out.println();

        Geometri Cylinder = new Cylinder(4, 8);
        System.out.println("Volume of Cylinder: " + Cylinder.hitungVolume());
        System.out.println("Area of Alas Cylinder: " + Cylinder.hitungLuasAlas());
        System.out.println("Parameter of Alas Cylinder : " + Circle.hitungKeliling());
        System.out.println();

        Geometri Block = new Block(2, 4, 6);
        System.out.println("Volume of Block: " + Block.hitungVolume());
        System.out.println("Area of Alas Block: " + Block.hitungLuasAlas());
        System.out.println("Parameter of Alas Block : " + Rectangle.hitungKeliling());
        System.out.println();
    }
}