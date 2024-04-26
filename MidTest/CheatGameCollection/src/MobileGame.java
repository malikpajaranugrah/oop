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
        System.out.println("1. Unlock all levels");
        System.out.println("2. Unlimited coins");
    }
}
