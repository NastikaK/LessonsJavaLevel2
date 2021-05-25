package Lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        swapArrayElements(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 10; i++) {
            appleBox.addFruit(new Apple());
        }

        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 7; i++) {
            orangeBox.addFruit(new Orange());
        }

        Box<Orange> newOrangeBox = new Box<>();
        for (int i = 0; i < 5; i++) {
            newOrangeBox.addFruit(new Orange());
        }

        System.out.println("Вес коробки: " + orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        System.out.println("Фрукты успешно пересыплены. Теперь в коробке " + newOrangeBox.addFromBox(orangeBox) + "фруктов.");
    }

    public static void swapArrayElements(int[] arr, int i, int j) {
        int rememberElement = arr[i];
        arr[i] = arr[j];
        arr[j] = rememberElement;
    }
}
