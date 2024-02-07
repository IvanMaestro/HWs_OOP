package gb_Masterov.hw_02;

public class Human extends AnimateCreature{

    private double maxHeightJump;
    private double maxDistance;
    private int status;
    static int counter;

    public Human(String name, double maxHeightJump, double maxDistance) {
        super(name, maxHeightJump, maxDistance);
        this.maxHeightJump = maxHeightJump;
        this.maxDistance = maxDistance;
        counter++;
    }


    @Override
    void run() {
        System.out.println(super.name + " начинает проходить перпятствия!");
        status = 1;
    }

    @Override
    void runTest(double distance) {
        if(status != 0) {
            if (distance <= maxDistance) {
                System.out.println(super.name + " пробежал " + distance + " метров!");

            } else {
                System.out.println(super.name + " не смог пробежать " + distance + " метров!");
                status = 0;
            }
        }
    }

    @Override
    void jump(double distance) {
        if(status != 0) {
            if (distance <= maxHeightJump) {
                System.out.println(super.name + " перепрыгнул " + distance + " метров!");
            } else {
                System.out.println(super.name + " не смог перепрыгнуть " + distance + " метров!");
                status = 0;
            }
        }
    }

    @Override
    void endRace() {
        if(status == 1) {
            System.out.println(super.name + " успешно прошел препятствия!");
        } else {
            System.out.println(super.name + " не смог пройти препятствия!");
        }
    }
}