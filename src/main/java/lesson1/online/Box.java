package lesson1.online;

import java.util.ArrayList;


public class Box<F extends Fruit> {

    ArrayList<F> fru;

    public Box() {
        this.fru = new ArrayList<>();
    }


    public void add(F fruit) {
        this.fru.add(fruit);
    }

    public float getWeight() {
        if (this.fru.size() == 0) return 0.0f;
        float weight = this.fru.size() * this.fru.get(0).getWeight();

        return weight;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }

    public void interlard(Box<? super F> another) {
        if (this == another) return;
        another.getFruits().addAll(fru);
        fru.clear();
    }

    public  ArrayList<F> getFruits() {
        return fru;
    }
}
