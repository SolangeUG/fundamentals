# Arrays

*Arrays* are a fundamental programming construct. Their primary purpose is to facilitate storing and manipulating large 
quantities of data. An array stores a sequence of values that are all of the **same type**. Each value stored in an array 
is called an **element** of that array. Since the length of an array determines the maximum number of things that can be 
stored in the array, the length of an array is sometimes referred to as its **capacity**.

## Arrays in Java

Arrays in Java are somewhat *unusual*, in that they are not technically a base type nor are they instances of a particular class.
With that said, an instance of an array is treated as an **object** by Java, and variables of an array type are 
*reference variables*.

Once we create an array, its size is *fixed*. The reason that we need to explicitly create arrays at runtime is that the 
Java compiler cannot know how much space to reserve for the array at compile time (as it can for primitive types).
When arrays are created using the `new` operator, all of their elements are automatically assigned  the default value for 
the element type. That is : 
- if the element type is numeric, all cells of the array are initialized to `0`
- if the element type is boolean, all cells of the array are initialized to `false`
- and if the element type is a reference type (`String` for example), all cells are initialized to `null`.

You should remember that the time required to create an array is proportional to its length!

## Memory Representation

Arrays are fundamental data structures in that they have a direct correspondence with memory systems on virtually all 
computers. The elements of an array are stored *consecutively* in memory, so that it is easy to quickly access any array 
value (*random access*). Indeed we can view memory itself as a giant array. On modern computers memory is implemented in 
hardware as a sequence of indexed memory locations that each can be quickly accessed with an appropriate *address*.
It is convenient to think of the name of the array - say `a` - as storing the memory address of the first element of the 
array `a[0]`. 

**Accessing element i of an array is an efficient operation because it simply requires adding two integers 
and then referencing memory - just two elementary operations. When dealing with different-sized array elements, this just 
involves multiplying the index by the element size before adding to the array address.**

Arrays directly represent vectors and matrices, so they are of direct use in computations associated with many basic problems 
in science and engineering. Arrays also provide a succinct notation for manipulating a potentially huge amount of data in 
a uniform way, so they play a critical role in any application that involves processing large amounts of data.  



