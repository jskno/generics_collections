package com.jskno.a_basic_generics.b_generic_presentation;

public class b1_GenericPresentation {

    public static void main(String[] args) {

        Store store = new Store();
        store.setItem(45.54);
        Object item = store.getItem();
        System.out.println(item);
        // We can CAST Object into any other object
        // Casting indicates BAD PROGRAMMING DESIGN
        Double doubleItem = (Double) store.getItem();
        System.out.println(doubleItem);

        // ClassCastException at runtime
        Integer integerItem = (Integer) store.getItem();
        System.out.println(integerItem);

        // BY USING GENERICS
        GenericStore<Double> genericStore = new GenericStore<>();
        genericStore.setItem(26.8);
        // No need for casting
        Double myItem = genericStore.getItem();
        System.out.println(myItem);

        // RUN-TIME EXCEPTION ARE NOT COMPILE TIME ERRORS
//        genericStore.setItem("A string");
//        Integer myIntegerItem = genericStore.getItem();

    }

}

class Store {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}

class GenericStore<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
