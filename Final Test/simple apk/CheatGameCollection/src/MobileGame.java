public class MobileGame extends Game {
    private String deviceType;

    public MobileGame(String name, String deviceType) {
        super(name);
        this.deviceType = deviceType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Game: " + name);
        System.out.println("Device Type: " + deviceType);
    }

    @Override
    public void displayCheats() {
        System.out.println("Cheats for " + name + " on Mobile:");
        System.out.println("1. Money Never Runs Out : \n     8 0 0 5 7 3 F 0 F F F F");
        System.out.println("2. Stamina Remains 200% : \n     8 0 0 7 1 A 1 2 0 E 3 7");
    }
}
