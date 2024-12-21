package com.jskno.e_type_erasure.exercise;


public class D_ExerciseWithInterface {

    public static void main(String[] args) {
        runExercise();
    }

    public static void runExercise() {

        // you have to implement the other classes such that the following code can run without any error
        Library<Algorithm> library = new Library<>();
        library.add(new SearchAlgorithm());
        library.add(new SortingAlgorithm());
        library.add(new GraphAlgorithm());

        Algorithm item = library.getLast();

        while (item != null) {
            item.execute();
            item = library.getLast();
        }
    }

}

