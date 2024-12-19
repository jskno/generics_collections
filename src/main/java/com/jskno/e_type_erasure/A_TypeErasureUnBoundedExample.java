package com.jskno.e_type_erasure;

public class A_TypeErasureUnBoundedExample {

    public static void main(String[] args) {

        // Generics
        FirstStore<Integer> fs = new FirstStore<>();
        fs.setItem(3);
        Integer fsItem = fs.getItem();
        System.out.println(fsItem);

        // After Type Erasure
        FirstStoreByteCode fsBc = new FirstStoreByteCode();
        fsBc.setItem(3);
        Integer fsBcItem = (Integer) fsBc.getItem();
        System.out.println(fsBcItem);

    }



}

class FirstStore<T> {
    private T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class FirstStoreByteCode {
    private Object item;

    public Object getItem() {
        return this.item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
