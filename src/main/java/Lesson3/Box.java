package Lesson3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public float getWeight() {
        return fruitList.size() * fruitList.get(0).getFruitWeight();
    }

    public boolean compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }

    public int addFromBox(Box<T> box) {
        System.out.println("");
        fruitList.addAll(box.fruitList);
        box.fruitList.clear();
        return fruitList.size();
    }
}

