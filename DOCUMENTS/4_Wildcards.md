Wildcards

    Subtyping
        Subtyping is a fundamental principle in object-oriented programming 
        One type is a subtype of another if they are related by an extends or implements clause

            Integer is a subtype of Number
            ArrayList<E> is a subtype of List<E>
            List<E> is a subtype of Collection<E>

        If one type is a subtype of another then it means that the second is a supertype of the first

            Integer is a subtype of Number
            List<Integer> is NOT a subtype of List<Number>

        Despite the fact that Integer is a Number because of inheritance
        A List<Integer> is not a subtype of List<Number> !!!

        This is the reason why we need to consider  WILDCARDS.
        The supertype of all kinds of collections are wildcards

            public void print(Collection<Object> c) {
                for(Object o: c) {
                    System.out.println(o);
                }
            }

        The solution:

            public void print(Collection<?> c) {
                for(Object o: c) {
                    System.out.println(o);
                }
            }

        We can print anything we want (integers, doubles or strings) but we can not insert into this
        collection becasue we do not know the type
    