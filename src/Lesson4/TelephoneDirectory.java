package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TelephoneDirectory {
    private HashMap<String, HashSet<String>> directory = new HashMap<>();

    public void addPhoneNumber(String surname, String phonesNumber) {
        HashSet<String> phonesHashSet;
        if (directory.containsKey(surname)) {
            phonesHashSet = directory.get(surname);
        } else {
            phonesHashSet = new HashSet<>();
            directory.put(surname, phonesHashSet);
        }
        phonesHashSet.add(phonesNumber);
    }

    public ArrayList<String> getPhoneNumber(String surname) {
        ArrayList<String> phones = new ArrayList<>();
        HashSet<String> phonesSet = directory.get(surname);
        if (phonesSet != null) {
            phonesSet.stream().forEach(x -> phones.add(x));
        }
        return phones;
    }

    @Override
    public String toString() {
        return "Telephone Directory{" +
                "directory=" + directory +
                '}';
    }

    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.addPhoneNumber("Иванов", "+77777");
        telephoneDirectory.addPhoneNumber("Петров", "+9999");
        telephoneDirectory.addPhoneNumber("Сидоров", "+33333");
        telephoneDirectory.addPhoneNumber("Сидоров", "+88888");
        System.out.println(telephoneDirectory);
        System.out.println(telephoneDirectory.getPhoneNumber("Сидоров"));
    }

}
