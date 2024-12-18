
Why to use generics and generic programming?

1. Generics add stability to your code.
2. It makes most of the bugs and errors to be detectable at compile time and not at run-time.
3. Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods
4. We can reuse the same code with different inputs
    public void draw(Car car) --> in this case the car parameter is a value
    public void draw(Bike bike) --> overladding methods to be able to draw different classes

    public void draw(T t) --> instead overloading we can use generic type (BUT INTERFACE WOULD ALSO DO !!)
    public void draw(Drawable drawable) { drawable.draw() }

    public interface Drawable() { void draw(); } 

Generics has many benefits:

1. Stronger type checks at compile time
    If our code violates type safety then the compiler warns us and this is exactly why we prefer compile time errors
2. We can eliminate type casting
    List myList = new ArrayList();
    String name = (String) myList.get(0);
        --> in this case we do not use generics which means we have to cast the objects into Strings
            
    THE JVM MUST TEST TYPE CASTING AT RUN-TIME

    List myList<String> = new ArrayList<>();
    String name = myList.get(0);
3. Generic Algorithms
    We can implement generic algorithms and methods and we can reuse them whenever we want
    For example: sorting integers, floats or doubles
4. It is easier to read generic code