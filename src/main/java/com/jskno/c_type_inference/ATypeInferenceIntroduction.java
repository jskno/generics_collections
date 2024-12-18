package com.jskno.c_type_inference;

import java.util.ArrayList;
import java.util.List;

public class ATypeInferenceIntroduction {

    public static void main(String[] args) {

        List<Bucket<String>> list = new ArrayList<>();

        // In here type inference is doing the job
        ATypeInferenceIntroduction.addStore("Adam", list);

        // In here we are explicitly doing the job and type inference has nothing to do
        // This is the called "type witness"
        ATypeInferenceIntroduction.<String>addStore("Daniel", list);
    }

    private static <T> void addStore(T t, List<Bucket<T>> list) {

        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + " has been added to the list...");
    }

}

class Bucket<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
