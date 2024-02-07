package gb_Masterov.hw_02;

public abstract class Creator {
    protected String name;
    protected double maxHeightJump;
    protected double maxDistance;

    static int counter;

    public Creator(String name, double maxHeightJump, double maxDistance) {
        this.name = name;
        this.maxHeightJump = maxHeightJump;
        this.maxDistance = maxDistance;
        counter++;
    }

    abstract void run();
    abstract void runTest (double distance);
    abstract void jump (double height);
    abstract void endRace();
    public String getName() {
        return name;
    }
}