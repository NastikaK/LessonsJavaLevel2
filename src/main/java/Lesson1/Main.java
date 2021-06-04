package Lesson1;

public class Main {
    public static void main(String[] args) {
        Contestant[] contestants = {
                new Cat("Мурзик", 400, 1),
                new Robot("R2D2", 500, 5),
                new Human("Олег", 1500, 2.5),
                new Human("Мария", 1000, 1.7),
                new Robot("Т100", 1000, 4)
        };

        Stage[] stages = {
                new Treadmill(350),
                new Wall(0.5),
                new Treadmill(500),
                new Wall(2)
        };

        for (Contestant contestant : contestants) {
            boolean passed = true;

            for (Stage stage : stages) {
                passed &= stage.tryExecute(contestant);
                if (!passed) {
                    System.out.println("Участник не смог пройти полосу препятствий");
                    break;
                }
            }
            if (passed) System.out.println("Участник успешно прошел все испытания!");
            System.out.println("=============================================");
        }
    }
}
