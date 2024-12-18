package com.jskno.d_wildcards;

import java.util.Collection;
import java.util.List;

public class AWildcardsIntroduction {

    public static void main(String[] args) {
        List<Integer> myIntegersList = List.of(1, 2, 3, 4, 5);

        // Compile error
//        print(myIntegersList);

        List<Object> myObjectsList = List.of(1, 2, 3, 4, 5);
        print(myObjectsList);

        // Solution
        printSolved(myIntegersList);
        printSolved(myObjectsList);

        printSolved(List.of(
            new Store("mobile", 200.0),
            new Store("laptop", 3200.0)
        ));
    }
    public static void print(Collection<Object> c) {
        for(Object o: c) {
            System.out.println(o);
        }
    }

    // UNBOUNDED WILDCARDS
    public static void printSolved(Collection<?> c) {
        for(Object o: c) {
            System.out.println(o);
        }
    }

}

class Store {
    private String item;
    private Double price;

    public Store(String item, Double price) {
        this.item = item;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Store{" +
            "item='" + item + '\'' +
            ", price=" + price +
            '}';
    }
}
