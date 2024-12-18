package com.jskno.a_basic_generics.b_generic_presentation;

public class b2_InterfaceSolution {

    public static void main(String[] args) {

        InterfaceStore interfaceStore = new InterfaceStore();
        interfaceStore.setItem(new Milk("Desnatada", "Pascual"));
        Storable item = interfaceStore.getItem();

        InterfaceStore interfaceStore2 = new InterfaceStore();
        interfaceStore2.setItem(new Water("Liviana", 1.5));
        Storable item2 = interfaceStore2.getItem();

        // Similar solution with interfaces shows that the retrieved item would be of the interface type
        // and to do operations with its own type there will be to have a CASTING

    }

}

interface Storable { }

record Milk(String type, String name) implements Storable {}
record Water(String brand, double quantity) implements Storable {}

class InterfaceStore {
    private Storable item;

    public Storable getItem() {
        return item;
    }

    public void setItem(Storable item) {
        this.item = item;
    }
}
