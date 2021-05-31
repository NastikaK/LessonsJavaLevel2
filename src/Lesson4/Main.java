package Lesson4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Кот", "Собака", "Мышь", "Кот", "Енот", "Белка", "Лиса", "Кот", "Мышь", "Волк", "Кабан", "Собака"};

        HashSet<String> wordHashSet = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные значения массива: " + wordHashSet);

        HashMap<String, Integer> repeatedWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (repeatedWords.containsKey(words[i])) {
                repeatedWords.put(words[i], repeatedWords.get(words[i]) + 1);
            } else {
                repeatedWords.put(words[i], 1);
            }
        }
        System.out.println("Повторяющиеся слова в массиве: " + repeatedWords);

    }
}
