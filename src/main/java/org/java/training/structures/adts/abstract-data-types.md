# Abstract Data Types

A **data type** is a set of values and a set of operations on those values.
For example, the *values* of the primitive data type `int` are integers between `-2^31` and `2^31 - 1`; the *operations* 
of `int` include `+`, `*`, `-`, `/`, `%`, `<` and `>`.

An **abstract data type (ADT)** is a data type whose representation is hidden from the client.
When using an ADT, we focus on the *operations* specified in the API and pay no attention to the data representation.
When implementing an ADT, we focus on the *data*, then implement operations on that data.
Abstract data types are important because they support **encapsulation** in program design.

## API for an ADT

You do not need to know how a data type is implemented in order to be able to use it. 
To specify the **behavior** of an abstract data type, we use an **application programming interface (API)**, which is a 
list of *constructors* and *instance methods* (operations), with an informal description of the effect of each.

An API for an abstract data type is a contract with all clients and, therefore, the starting point both for developing 
any client code and for developing any data-type implementation. 
By *encapsulating* all the code that implements a data type within a single Java class, we enable the development of client 
code at a higher level of **abstraction**.

## Examples of Abstract Data Types

Several different categories of ADTs in Java:

- standard system ADTs in `java.lang.*`, which can be used in any Java program
- Java ADTs in libraries such as `java.net`, or `java.io`, which can also be used in any Java program but need an `import` 
statement
- data-oriented ADTs whose primary purpose is to facilitate organizing and processing data by encapsulating the representation
- collection ADTs whose primary purpose is to facilitate manipulating collections of data of the same type. Example : `Bag`, 
`Stack`, `Queue`, `Priority Queue`, `Set`, etc.
- operations-oriented ADTs that are used to analyze algorithms
- ADTs for graph algorithms, including both data-oriented ADTs that focus on encapsulating representations of various kinds 
of graphs, and operations-oriented ADTs that focus on providing specifications for graph-processing algorithms.
- ...

## API, Clients and Implementations

These are the basic components to build and use abstract data types in Java. Think of the needs of client, then accommodate 
them in an ADT, following these three steps :

- **Specify an API** : the purpose of the API is to *separate clients from implementations*, to enable modular programming.
- **Implement a Java class that meets the API specifications** : first, choose the instance variables, then write constructors 
and the instance methods.
- **Develop multiple test clients** to validate the design decisions made in the first two steps.

## API Example

Whenever you have data of different types that logically belong together, it is worthwhile to contemplate defining an ADT 
as in the following example.

````Java
public class Date implements Comparable<Date> {
    // create a date
    Date(int month, int day, int year);
    
    // create a date (parse constructor)
    Date(String date);
    
    // return the month
    int month();
    
    // return the day
    int day();
    
    // return the year
    int year();
    
    // string representation
    String toString();
    
    // is this the same date as that?
    boolean equals(Object that);
    
    // compare this date to that
    int compareTo(Date that);
    
    // hashcode
    int hashCode();
}

````
  