package lesson1.online;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork1 {
    public static void main(String[] args){
        String[] arr = {"Work", "Home"};

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

        System.out.println();

        getArras(arr);

        for(String i : arr)
            System.out.print(i);

        System.out.println();
        System.out.println("*************************************************************");



        System.out.println(getList(arr));
        System.out.println("*************************************************************");

        Apple apple = new Apple(1.0f);
        Orange orange = new Orange(1.5f);


        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox1.add(apple);
        appleBox1.add(apple);
        appleBox1.add(apple);
        appleBox2.add(apple);
        orangeBox1.add(orange);
        orangeBox1.add(orange);
        appleBox1.getWeight();
        orangeBox1.getWeight();

        System.out.println("Коробка1 яблок - " + appleBox1.getWeight());
        System.out.println("Коробка1 апельсинов - " + orangeBox1.getWeight());
        System.out.println(orangeBox1.compare(appleBox1));
        appleBox1.interlard(appleBox2);
        orangeBox1.interlard(orangeBox2);
        System.out.println("Коробка1 яблок - " + appleBox1.getWeight());
        System.out.println("Коробка2 яблок - "+ appleBox2.getWeight());
        System.out.println("Коробка1 апельсинов - " + orangeBox1.getWeight());
        System.out.println("Коробка2 апельсинов - " + orangeBox2.getWeight());


    }

    public static <T> void getArras(T[] arras){
        T temp = arras[0];
        arras[0] = arras[1];
        arras[1] = temp;

    }
    public static <E> ArrayList<E> getList(E[] arras){
        ArrayList<E> str = new ArrayList<E>(arras.length);
        for (E e : arras) {
            str.add(e);
        }
        return str;
    }




}


