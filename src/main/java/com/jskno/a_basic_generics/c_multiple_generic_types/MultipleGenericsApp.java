package com.jskno.a_basic_generics.c_multiple_generic_types;

public class MultipleGenericsApp {

    public static void main(String[] args) {

        HashTable<String, Integer> hashTable = new HashTable<>("Hello", 23);
        System.out.println(hashTable);
        System.out.println("Key length is :" + hashTable.getKey().trim().length());

        HashTable<String, Double> hashTable2 = new HashTable<>("Hello", 23.58);
        System.out.println(hashTable2);
        System.out.println("Key length is :" + hashTable2.getKey().trim().length());

    }

}

class HashTable<K, V> {
    private K key;
    private V value;

    public HashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTable{" +
            "key=" + key +
            ", value=" + value +
            '}';
    }
}
