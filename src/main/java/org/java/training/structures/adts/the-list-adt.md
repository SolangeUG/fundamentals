# The List ADT

*Lists* represent a linearly ordered sequence of elements (ie: sequential, ordered collections of values of a certain type). 
They differ from Java's built-in primitive collection type of arrays in that they are **unbounded**, so you do not need 
to specify the size of the array before using it.

Java defines a general **interface**, `java.util.List` that includes the following index-based methods (and more):

|   Method      |   Description   |
|--------------:|-----------------|
| `size()`      |   Returns the number of elements in the list. |
| `isEmpty()`   |   Returns a boolean indicating whether the list is empty. |
| `get(i)`      |   Returns the element of the list having index *i*. <sup>1</sup> |
| `set(i, e)`   |   Replaces the element at index *i* with *e*, and returns the old element that was replaced. <sup>1</sup> |
| `add(i, e)`   |   Inserts a new element *e* into the list so that it has index *i*, moving all subsequent elements one index later in the list. <sup>1</sup> |
| `remove(i)`   |   Removes and returns the element at index *i*, moving all subsequent elements one index earlier in the list. <sup>1</sup> |

><sup>1</sup> An error condition occurs if *i* is not in range `[0, size()-1]`

## List Implementations

In Java, we generally work with either `ArrayList`s or `LinkedList`s. Whenever working with a list, you should always 
work to the `List` interface where possible. Method and constructor parameters should be the `List` interface, as should 
filed definitions. This will make it easier to swap implementing types depending on the scenario.

At times it is more appropriate to use an `ArrayList` than a `LinkedList`, and vice versa. The use case for which of the list 
implementations to use will vary, but make sure you think it through, because it can have serious implications on your 
application's performance, or its memory usage.  

## Iterators

An **iterator** is a software design pattern that abstracts the process of scanning through a sequence of elements, one 
element at a time. In order to unify the treatment and syntax for iterating objects in a way that is independent from a 
specific organization, Java defines the `java.util.Iterator` interface with the following two methods :

|   Method      |   Description   |
|--------------:|-----------------|
| `hasNext()`   |   Returns `true` if there is at least one additional element int the sequence, and `false` otherwise. |
| `next()`      |   Returns the next element in the sequence. |
