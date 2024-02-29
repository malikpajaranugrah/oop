public class Kotak {
    public double lebar;
    public double tinggi;
    
    public Kotak(double lebar, double tinggi) {
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public void setWidth(double lebar) {
        this.lebar = lebar;
    }
    
    public void setHeight(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getLuas() {
        return lebar * tinggi;
    }
    
    public double getPerimeter() {
        return 2 * (lebar + tinggi);
    }
}
