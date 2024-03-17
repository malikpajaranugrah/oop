public class AnyTA extends Triangle {
    public AnyTA (String name, double sideA, double sideB, double sideC) {
        super(name, sideA, sideB, sideC);  
    }

    @Override
    public double calculatearea() {
        double s = (getsideA() + getsideB() + getsideC())/2;
        double luas = Math.sqrt( s * (s-getsideA()) * (s-getsideB()) * (s-getsideC()));
        return luas;
    }
}
