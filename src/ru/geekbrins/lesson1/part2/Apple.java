package ru.geekbrins.lesson1.part2;

public class Apple extends Fruit{

    /*
     * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
     * (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
     * */

    @Override
    public float getWeight() {
        return 1.0f;
    }
}
