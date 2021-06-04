package Lesson2;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(int i) {
        System.out.println("Невозможно создать массив длинной " + i);
    }
}
