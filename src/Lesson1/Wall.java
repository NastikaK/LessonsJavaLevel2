package Lesson1;

public class Wall implements Stage {
    private double wallHeight;

    public Wall(double wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean tryExecute(Contestant contestant) {
        return contestant.canJump(wallHeight);
    }
}
