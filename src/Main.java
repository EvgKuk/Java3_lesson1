import ru.geekbrins.lesson1.part2.Apple;
import ru.geekbrins.lesson1.part2.Box;
import ru.geekbrins.lesson1.part2.Orange;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        int[] firstArray = new int[5];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;
        }
        System.out.println("Исходный массив: " + Arrays.toString(firstArray) + "\n");

        changeElements(0,4,firstArray);

        convertArray(firstArray);

        System.out.println("\n 3. Большая задача: ");
        testBox();


    }

    /*
     Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа).
    */

    public static void changeElements(int a, int b, int[] firstArray) {
        int c = firstArray[a];
        firstArray[a] = firstArray[b];
        firstArray[b] = c;

        System.out.println("Отработал метод changeElements для замены местами элементов массива\n"
                + "Полученный массив: " + Arrays.toString(firstArray) + "\n");

    }

    /*
    * Написать метод, который преобразует массив в ArrayList;
    */

    public static void convertArray(int[] firstArray) {
        ArrayList<int[]> arrayList = new ArrayList<>(Arrays.asList(firstArray));
        String s = Arrays.toString(arrayList.get(0));

        System.out.println("Отработал метод convertArray для преобразования массива в ArrayList\n"
                + "Полученный массив: " + s);
    }

    /*
     * 3. Большая задача:
     * a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
     * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
     * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
     * (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
     * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
     * которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае
     * (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
     * (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей
     * коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
     * g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void testBox() {

        /*
        * Создаём коробки с фруктами.
        */
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();

        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();

        /*
         * Наполняем коробки фруктами.
         */
        orange1.addFruit(new Orange(), 5);
        orange2.addFruit(new Orange(), 2);

        apple1.addFruit(new Apple(), 3);
        apple2.addFruit(new Apple(), 30);

        /*
         * Вычисляем вес коробок.
         */
        System.out.println("\n Вес коробок с фруктами: " +
                           "\n Коробка №1: " + orange1.getWeight() +
                           "\n Коробка №2: " + orange2.getWeight() +
                           "\n Коробка №3: " + apple1.getWeight() +
                           "\n Коробка №4: " + apple2.getWeight());

        /*
         * Сравниваем вес коробок.
         */
        System.out.println( "\n Сравниваем коробоки с фруктами: " +
                            "\n Коробку №1 с Коробкой №3 " + orange1.compare(apple1) +
                            "\n Коробку №2 с Коробкой №3 " + orange2.compare(apple1) +
                            "\n Коробку №2 с Коробкой №4 " + orange2.compare(apple2));

        /*
         * Пересыпаем из одной коробки в другую.
         */
        orange1.getOutTo(orange2);
        apple1.getOutTo(apple2);
        System.out.println( "\n Новый вес коробок с фруктами: " +
                            "\n Коробка №1: " + orange1.getWeight() +
                            "\n Коробка №2: " + orange2.getWeight() +
                            "\n Коробка №3: " + apple1.getWeight() +
                            "\n Коробка №4: " + apple2.getWeight());

    }

}
