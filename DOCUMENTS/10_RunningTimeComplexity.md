
Running Time Complexity

* It is quite hard to define the running time of a given algorithm - because it depends on the underlying hardware
* So maybe measuring the running time is not the best option possible
* Better approach: measure the number of steps instead - how many steps a given algorithm requires with respect to the input

        We want to sort an array with N items. How many steps does the given sorting algorithm requires?
                [ 5, -4, 8, 2, 1, 12 ]


* O(1) - constant running time complexity
  These algorithm are the fastest approaches: the running time is independent of the N input (number of items)
  Example: we want to swap two items with known indexes in a given one-dimensional array
* O(N) - linear running time complexity
  These algorithms' running time scales linearly with the N input so the running time increases linearly with the size of the input
  Example: we want to find an unknown item in a one-dimensional array (linear search)
* O(logN) - logarithm running time complexity
  These algorithms' running time scales logarithmically with the N input so the running time increases logarithmically with the size of the input
  Example: we want to find an unknown item in a sorted one-dimensional array (binary search)
* O(NlogN) - linear logarithmic running time complexity
* O(n^2) - quadratic running time complexity
* O(2^n) - exponential running time complexity
* O(n!) - factorial running time complexity