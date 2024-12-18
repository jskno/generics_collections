package com.jskno.a_basic_generics.b_generic_presentation;

public class b3_GenericSolution {

    public static void main(String[] args) {

        JustStore<JustMilk> justMilkStore = new JustStore<>();
        justMilkStore.setItem(new JustMilk("Desnatada", "Pascual"));
        JustMilk item = justMilkStore.getItem();
        System.out.println("Item name: " + item.name());

        JustStore<JustWater> interfaceStore2 = new JustStore<>();
        interfaceStore2.setItem(new JustWater("Liviana", 1.5));
        JustWater item2 = interfaceStore2.getItem();
        System.out.println("Item brand: " + item2.brand());

        // Similar solution with generics shows that the retrieved item would be the actual class
        // and to do operations with its own type there will be no need to have a CASTING
        // But the TYPE OF THE ITEM must be declared while creating the Store

    }

}

record JustMilk(String type, String name) {}
record JustWater(String brand, double quantity) {}

class JustStore<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
