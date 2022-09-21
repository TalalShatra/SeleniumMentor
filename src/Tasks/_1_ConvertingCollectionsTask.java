package Tasks;

import java.util.*;

public class _1_ConvertingCollectionsTask {
    public static void main(String[] args) {

        Integer[] array = new Integer[10];

        for (int i = 0; i < 10; i++)
            array[i] = (int)(Math.random()*10);

        System.out.println("Array: " + Arrays.toString(array));

        List<Integer> listConvertedFromArray = new ArrayList<>(Arrays.asList(array));
        System.out.println("List converted from an array: " + listConvertedFromArray);

        Set<Integer> setConvertedFromList = new HashSet<>(listConvertedFromArray);
        System.out.println("Set converted from a list: " + setConvertedFromList);

    }
}
