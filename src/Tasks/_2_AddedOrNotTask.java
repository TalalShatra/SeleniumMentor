package Tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Task
// create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
// count how many duplicates we have
// find out what are the duplicated values

public class _2_AddedOrNotTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(3); list.add(1); list.add(2); list.add(4);
        list.add(5);list.add(3);
         System.out.println(list);

        Set<Integer> uniqueValues = new HashSet<>();
        List<Integer> duplicateValues = new ArrayList<>();

        int duplicatedCount = 0;

        for (int i = 0; i < list.size(); i++) {
            boolean isAdded = uniqueValues.add(list.get(i));
            if (!isAdded) {
                duplicatedCount++;
                duplicateValues.add(list.get(i));
            }}
        System.out.println("Number of values duplicated: " + duplicatedCount);
        System.out.println("Duplicated values: " + duplicateValues);
    }
}
