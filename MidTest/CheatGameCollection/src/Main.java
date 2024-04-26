public class Main {
    public static void main(String[] args) {
        PSGame psGame = new PSGame("The Last of Us", "PS4");
        PCGame pcGame = new PCGame("GTA V", "Windows");
        MobileGame mobileGame = new MobileGame("Clash of Clans", "Smartphone");

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
