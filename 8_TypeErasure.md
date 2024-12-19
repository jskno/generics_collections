
Type Erasure

* Java uses type erasure to implement generics - this is how generic code is handled
* It replaces all generic type parameters with their bounds or Object for unbounded type parameters
* It is true for wildcards as well
* So the final bytecode will contain plain java classes and objects

SO FOR BOUNDED PARAMETERS:

    public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {

java is going to replace <T extends Comparable<T> for its bound: Comparable

    public static Comparable calculateMin(Comparable num1, Comparable num2) {

AND FOR UNBOUNDED PARAMETERS:

    public <T> T showItem(T item) {

java is going to replace T by Object

    public Object showItem(Object item) {

The same for wildcards:
    - bounded for its bound
    - unbounded for Object

* It may happen that type erasure uses type casting
* Sometimes it is needed to generate addition methods
* These are called bridge methods to maintain polymorphism with generic types as well


FOR EXAMPLE 

Your code:

    List<Integer> list = new ArrayList<>();
    list.add(3);
    Integer num = list.get(0);

In the bytecode the two code snippets are equivalent
There may be Objects and type castings in the bytecode

Bytecode result (after Type Erasure):

    List list = new ArrayList();
    list.add(3);
    Integer num = (Integer) list.get(0);

During Type Erasure Java is going to get rid of Wildcards and Generic Type parameters
and it will use RAW TYPES, CLASS CASTING AND SO ON

The function of Wildcards and Generics is transfor the Runtime exception in Compile error
So it is only there to help to write code, nothing else !!!