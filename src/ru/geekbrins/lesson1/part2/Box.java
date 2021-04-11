package ru.geekbrins.lesson1.part2;

import java.util.ArrayList;

/*
 * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 */

public class Box <E extends Fruit>{

    /*
    *c. Для хранения фруктов внутри коробки можете использовать ArrayList;
    */

    public final ArrayList <E> box = new ArrayList<>();

    public Box(){
    }

    /*
     * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
     * (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
     * */

    public float getWeight(){
        float weight = 0.0f;
        for (E obj : box){
            weight += obj.getWeight();
        }
        return weight;
    }

    /*
     * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
     * которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае
     * (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
     * */

    public boolean compare(Box otherBox){
        return getWeight() == otherBox.getWeight();
    }

    /*
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
     * (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно
     * в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
     * */

    public void getOutTo(Box<E> otherBox){
        otherBox.box.addAll(box);
        box.clear();
    }

    /*
     * g. Не забываем про метод добавления фрукта в коробку.
     * */

    public void addFruit(E fruit, int coll){
        for (int i = 0; i<coll; i++){
            box.add(fruit);
        }
    }
}
