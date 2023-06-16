import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


public class Homework {
    public static void main(String[] args) {
        ArrayList<Integer> test_list = new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11)
        );

        removeEven(test_list);
        System.out.println(test_list); // [1, 3, 5, 7, 9, 19, 17, 15, 13, 11]
        System.out.println(findMin(test_list)); // 1
        System.out.println(findMax(test_list)); // 19
        System.out.println(findMiddle(test_list)); // 9


        ArrayList<Integer> test_list_2 = new ArrayList<Integer>(
                Arrays.asList(2,6,7,3,0,1,2,4,5,4,3,-10,-5,100,1999,-99,0,123,6,50,4, -2010)
        );

        System.out.println(findMin(test_list_2)); // -2010
        System.out.println(findMax(test_list_2)); // 1999
        System.out.println(findMiddle(test_list_2)); // -5
        removeEven(test_list_2);
        System.out.println(test_list_2); // [7, 3, 1, 5, 3, -5, 1999, -99, 123]


    }

    /**
     * Пусть дан произвольный список целых чисел.
     * <p>
     * 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
     * 2) Найти минимальное значение         (Integer findMin(ArrayList<Integer> list))
     * 3) Найти максимальное значение
     * 4) Найти среднее значение
     * <p>
     * То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.
     */

    static void removeEven(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
            if (element % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    static int findMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Integer element = list.get(i);
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Integer element = list.get(i);
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    static int findMiddle(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int middleValue = (findMax(list) - findMin(list)) / 2 + findMin(list);
        int minDiff = Math.abs(middleValue - list.get(0));
        int middle = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Integer element = list.get(i);
            if (Math.abs(middleValue - element) < minDiff) {
                minDiff = Math.abs(middleValue - element);
                middle = element;
            }
        }
        return middle;
    }

}




