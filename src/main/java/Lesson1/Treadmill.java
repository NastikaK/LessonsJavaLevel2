package Lesson1;

public class Treadmill implements Stage {
    private int treadmillLength;

    public Treadmill(int treadmillLength) {
        this.treadmillLength = treadmillLength;
    }

    @Override
    public boolean tryExecute(Contestant contestant) {
        return contestant.canRun(treadmillLength);
    }
}
