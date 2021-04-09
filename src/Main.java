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
     Написать метод, который преобразует массив в ArrayList;
    */

    public static void convertArray(int[] firstArray) {
        ArrayList<int[]> arrayList = new ArrayList<>(Arrays.asList(firstArray));
        String s = Arrays.toString(arrayList.get(0));

        System.out.println("Отработал метод convertArray для преобразования массива в ArrayList\n"
                + "Полученный массив: " + s);
    }


}
