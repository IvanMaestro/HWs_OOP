package gb_Masterov.hw_02;

public abstract class InanimateCreature extends Creator{
    private double maxHeightJump;
    private double maxDistance;
    private int status;
    static int counter;

    public InanimateCreature(String name, double maxHeightJump, double maxDistance) {
        super(name, maxHeightJump, maxDistance);
    }
}