public abstract class Game {
    protected String name;

    public Game(String name) {
        this.name = name;
    }

    public abstract void displayInfo();

    public abstract void displayCheats();
}
