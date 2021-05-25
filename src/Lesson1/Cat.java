package Lesson1;

public class Cat implements Contestant {

    private String name;
    private double maxLength;
    private double maxHeight;

    public Cat(String name, double runLength, double jumpHeight) {
        this.name = name;
        this.maxLength = runLength;
        this.maxHeight = jumpHeight;
    }

    public void run() {
        System.out.print("Кот " + name + " бежит: ");
    }

    public void jump() {
        System.out.print("Кот " + name + " прыгает: ");
    }

    @Override
    public boolean canRun(double length) {
        boolean canRun = length <= maxLength;
        run();
        if (canRun) {
            System.out.print("Успешно пробежал дистанцию " + length + " м.");
            maxLength -= length;
            System.out.println(" (сил осталось еще на " + maxLength + " м.)");
        } else {
            System.out.println("Не смог пробежать дистанцию " + length + " м.");
            System.out.println("Максимальные возможности кота " + name + " " + maxLength + " м.");
        }
        return canRun;
    }

    @Override
    public boolean canJump(double height) {
        boolean canJump = height <= maxHeight;
        jump();
        if (canJump) {
            System.out.println("Успешно перепрыгнул препятствие высотой " + height + " м.");
        } else {
            System.out.println("Не смог перепрыгнуть припятствие высотой " + height + " м.");
            System.out.println("Максимальные возможности кота " + name + " " + maxHeight + " м.");
        }
        return canJump;
    }
}
