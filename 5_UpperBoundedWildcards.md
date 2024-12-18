Upper Bounded Wildcards

* Sometimes we want to use wildcards with subtypes so child classes 
* For example, we want to show the items in a List<Rectangle> when the Rectangle is a Shape
        
        printAll(List<? extends T>)

* This method can accept a list of any subclass of T

* What if we want to add an item when using an upper bounded wildcard?

      addItem(List<? extends Number>)

* We cannot add an Integer to the list because the type cannot be guarantee - it may be a List<Double>
* We cannot add a Double to the list because the type cannot be guarantee - it may be a List<Integer>

* So there are two independent operations:

      we can read items from a List<? extends T>
      we cannot insert (add) items into a List<? extends T>

* You cannot add an item to a List<? extends T> because you cannot guarantee what list it is really pointing to.
* The only thing you can do for sure is to read the items
