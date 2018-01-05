package org.java.training.structures.adts;

/**
 * A simplified example of the List ADT
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 *
 * @author Solange U. Gasengayire
 */
interface List<E> {

    /**
     * Return the number of elements in this list
     * @return size of list
     */
    int size();

    /**
     * Return whether this list is empty
     * @return true if the list is empty
     *         false otherwise
     */
    boolean isEmpty();

    /**
     * Return (but do not remove) the element at index i
     * @param i index value
     * @return element at index i
     * @throws IndexOutOfBoundsException if i is out of range
     */
    E get(int i) throws IndexOutOfBoundsException;

    /**
     * Replace the element at index i with element e
     * and return the replaced element
     * @param i index value
     * @param e new element
     * @return the old element
     * @throws IndexOutOfBoundsException if i is out of range
     */
    E set(int i, E e) throws IndexOutOfBoundsException;

    /**
     * Insert element e to be at index i,
     * shifting all subsequent elements later
     * @param i index value
     * @param e element to insert
     * @throws IndexOutOfBoundsException if i is out of range
     */
    void add(int i, E e) throws IndexOutOfBoundsException;

    /**
     * Remove and return the element at index i,
     * shifting all subsequent elements earlier
     * @param i index value
     * @return the removed element
     * @throws IndexOutOfBoundsException if i is out of range
     */
    E remove(int i) throws IndexOutOfBoundsException;

}
