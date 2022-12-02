# Bucket Sort

Bucket sort is a sorting algorithm that separate the elements into multiple groups said to be buckets. 

Elements in bucket sort are first uniformly divided into groups called buckets, and then they are sorted by any other sorting algorithm. 
After that, elements are gathered in a sorted manner.

### The basic procedure of performing the bucket sort is given as follows -

First, partition the range into a fixed number of buckets.
Then, toss every element into its appropriate bucket.
After that, sort each bucket individually by applying a sorting algorithm.
And at last, concatenate all the sorted buckets.


### The advantages of bucket sort are -

Bucket sort reduces the no. of comparisons.
It is asymptotically fast because of the uniform distribution of elements.


### The limitations of bucket sort are -

It may or may not be a stable sorting algorithm.
It is not useful if we have a large array because it increases the cost.
It is not an in-place sorting algorithm, because some extra space is required to sort the buckets.
The best and average-case complexity of bucket sort is O(n + k), and the worst-case complexity of bucket sort is O(n2), where n is the number of items.
