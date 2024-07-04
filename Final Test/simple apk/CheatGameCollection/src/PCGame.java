public class PCGame extends Game {
    private String platform;

    public PCGame(String name, String platform) {
        super(name);
        this.platform = platform;
    }

    @Override
    public void displayInfo() {
        System.out.println("Game: " + name);
        System.out.println("Platform: " + platform);
    }

    @Override
    public void displayCheats() {
        System.out.println("Cheats for " + name + " on PC:");
        System.out.println("1. Full Life and Armor : \n     T U R T L E");
        System.out.println("2. Select all characters : \n     J R T A L E N T");
    }
}
