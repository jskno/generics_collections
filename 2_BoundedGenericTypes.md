
Bounded Generic Types

Sometimes we want to restrict the types that can be used as type arguments in a parameterized type
A method that operates on numbers (integers. floats or doubles) might only want to accept instances of the Number class or its sublclasses
This is exactly why there are bounded type parameters
Bounded types allow you to invoke methods defined in the bounds

This is how it can be done:
    <T extends Comparable>

It is misleading because no matter we are dealing with classes or interfaces, we have to use the extends keyword
(now we can invoke the methods defined in the Comparable interface when dealing with the T generic variable)

We can define multiple bounds
    <T extends B1 & B2 & B3>


1. What is the motivation behind bounded type parameters? We want to restrict the types that can be used as type arguments
2. Bounded types allow you to invoke methods defined in the bounds