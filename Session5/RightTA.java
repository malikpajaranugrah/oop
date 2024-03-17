public class RightTA extends Triangle {
    public RightTA (String name, double height, double base, double hypotenus) {
        super(name, height, base, hypotenus);  
    }

    @Override
    public double calculatearea() {
        double luas = 0.5 * getsideB() * getsideA(); 
        return luas;
    }
}
