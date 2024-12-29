package com.jskno.g_list;

import java.util.ArrayList;
import java.util.List;

public class A_ArrayListApp {

    public static void main(String[] args) {

        // resizing the array takes O(N) --> default size when not indicated is only 10
        List<String> names = new ArrayList<>();
        // If we know more or less the size is better to indicate
        List<String> namesWithSize = new ArrayList<>(5000);

        // adding elements at the end O(1)
        names.add("Kevin");
        names.add("Adam");
        names.add("Jose");
        names.add("Ana");

        // random indexing in O(1)
        System.out.println(names.get(2));

        // removing last element in O(1)
        // No need to shift
        names.removeLast();

        // ARRAYLIST (ARRAYS) ARE FAST IF WE MANIPULATE THE LAST ITEM OR ACCESS ITEMS BY INDEX

        // insert item into a given index - O(N)
        // Because under the hood Java shifts all the items
        names.add(1, "Daniel");

        // remove item from an arbitrary position - O(N)
        // Java is going to shift every single item > 1 to the left
        names.remove(1);

        // remove item by its value not index - O(N)
        // Search + Delete + Shift = O(N) + O(1) + O(N) = O(N)
        names.remove("Jose");

        // contains will check whether the item is present in the array inspecting one by one
        // Linear search will take O(N)
        System.out.println(names.contains("Adam"));

        for (String name: names) {
            System.out.println(name);
        }

        Object[] array = names.toArray();

        for (Object o: array) {
            System.out.println(o);
        }
    }

}
