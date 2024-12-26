Lower Bounded Wildcards

* We may want to use wildcards with supertypes, so with parent class
* This is usually useful when we want to insert items into a generic data structure or collection
        
        printAll(List<? super T>)

* This method can accept a list of any superclass of T

* What if we want to add an item when using an lower bounded wildcard?

      addItem(List<? super Integer>)

* We can add an Integer to the list without any problem
* We can add Numbers or even Objects to the list because Number and Object are superclasses of Integer

* So there are two independent operations:

      we cannot read items from a List<? super T> just Objects
      we can insert (add) items into a List<? super T>

* You cannot read items from a List<? super T> because you cannot guarantee what list it is really pointing to - we can read Objects exclusively.
* The only thing you can do for sure is to insert supertype of T into a List<? super T>
