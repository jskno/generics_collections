Bounded Types and Wildcards

* There is the so-called "get and put principle":
  * Use UPPER BOUNDED WILDCARD (? extends) when you only get values out of a structure or collection
  * Use LOWER BOUNDED WILDCARD (? super) when you only put values into a structure or collection
  * Do not use wildcards (?) if you want to do read and write operations as well, in these cases
  use BOUNDED TYPE PARAMETERS.


* There is a misconception about UPPER BOUNDED WILDCARDS: it does not provide immutability

        method(List<? extends T> myList)

* It is true that we cannot add items to this list but we may add NULL or we may apply other operations
  (for example sorting)


    WILDCARDS                               BOUNDED TYPES

  We do not have access to the          We can access the T generic type
  actual type (unknown type)
  
  Wildcards can handle a single         Bounded type parameters can 
  bound (extends or super)              handle multiple bounds
  
  You should use wildcards              You should use bounded type
  whenever possible                     parameters if you want to
                                        read and write as well
  
                                        
                                        public static <T extends Number & Comparable> copy(List<T> myList) {