package org.java.training.structures.adts;

/**
 * A simplified example of the Stack ADT.
 *
 * A collection of objects that are inserted and removed according to the
 * last-in first-out principle.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 *
 * @author Solange U. Gasengayire
 */
interface Stack<E> {

    /**
     * Return the number of elements in the stack
     * @return size of the stack
     */
    int size();

    /**
     * Test whether the stack is empty
     * @return true if the stack is empty
     *         false otherwise
     */
    boolean isEmpty();

    /**
     * Insert an element at the top of the stack
     * @param element element to be inserted
     */
    void push(E element);

    /**
     * Return (but not remove) the element at the top of the stack
     * @return top element in the stack
     *         or null if the stack is empty
     */
    E top();

    /**
     * Remove and return the top element from the stack
     * @return element removed
     *         or null if the stack is empty
     */
    E pop();

}
