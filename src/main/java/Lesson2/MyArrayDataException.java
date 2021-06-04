package Lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        System.out.println("Не удалось преобразовать элемент " + i + " " + j + " в числовое значение");
    }
}
