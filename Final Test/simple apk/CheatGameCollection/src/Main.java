public class Main {
    public static void main(String[] args) {
        PSGame psGame = new PSGame("Downhill", "PS2");
        PCGame pcGame = new PCGame("GTA V", "Windows");
        MobileGame mobileGame = new MobileGame("Harvest Moon", "Smartphone");

        System.out.println("--- Game Info ---");
        psGame.displayInfo();
        System.out.println();
        pcGame.displayInfo();
        System.out.println();
        mobileGame.displayInfo();

        System.out.println("\n--- Game Cheats ---");
        psGame.displayCheats();
        System.out.println();
        pcGame.displayCheats();
        System.out.println();
        mobileGame.displayCheats();
    }
}
