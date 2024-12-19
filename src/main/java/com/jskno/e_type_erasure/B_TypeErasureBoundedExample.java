package com.jskno.e_type_erasure;

import java.io.Serializable;

public class B_TypeErasureBoundedExample {

    public static void main(String[] args) {

        // Generics
        FirstBoundedStore<Integer> fs = new FirstBoundedStore<>();
        fs.setItem(3);
        Integer fsItem = fs.getItem();
        System.out.println(fsItem);

        // After Type Erasure
        FirstBoundedStoreByteCode fsBc = new FirstBoundedStoreByteCode();
        fsBc.setItem(3);
        Integer fsBcItem = (Integer) fsBc.getItem();
        System.out.println(fsBcItem);

    }
}

class FirstBoundedStore<T extends Serializable> {
    private T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class FirstBoundedStoreByteCode {
    private Serializable item;

    public Serializable getItem() {
        return this.item;
    }

    public void setItem(Serializable item) {
        this.item = item;
    }
}
