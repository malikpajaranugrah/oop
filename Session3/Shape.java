public class Shape {
    protected double area;
    protected double perimeter;
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void setname(String name){
        this.name = name;
    }

     public String getname() {
        return name;
    }

    public double calculatearea() {
        return 0.0; 
    }

    public double calculateperimeter() {
        return 0.0; 
    }

    public double getperimeter(){
        return perimeter;
    }
    
    public double getarea(){
        return area;
    }
}

