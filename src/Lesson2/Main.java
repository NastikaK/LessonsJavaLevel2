package Lesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] strings = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        System.out.println("Сумма всех элементов массива равна " + sumArray(strings));

        String[][] stringsWithException = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "=", "4"},
                {"1", "2", "3", "4"}
        };
        System.out.println("Сумма всех элементов массива равна " + sumArray(stringsWithException));

    }

    public static int sumArray(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        if (strings.length != 4) {
            throw new MyArraySizeException(strings.length);
        }

        for (String[] arr : strings) {
            if (arr.length != 4) {
                throw new MyArraySizeException(arr.length);
            }
        }

        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
