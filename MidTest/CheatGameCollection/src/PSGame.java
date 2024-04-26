public class PSGame extends Game {
    private String console;

    public PSGame(String name, String console) {
        super(name);
        this.console = console;
    }

    @Override
    public void displayInfo() {
        System.out.println("Game: " + name);
        System.out.println("Console: " + console);
    }

    @Override
    public void displayCheats() {
        System.out.println("Cheats for " + name + " on PS:");
        System.out.println("1. Unlimited health");
        System.out.println("2. Infinite ammo");
    }
}
