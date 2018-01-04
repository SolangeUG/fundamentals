/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.java.training.structures.arrays;

/**
 * ScoreBoard maintains a sequence of high scores, and is limited to a
 * certain number of high scores that can be saved.
 * Scores are stored in an array in non-decreasing order.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 *
 * @author Solange U. Gasengayire
 */
class ScoreBoard {

    // number of actual entries
    private int numEntries = 0;

    // array of game entries
    private GameEntry[] board;

    /**
     * Create an empty scoreboard with the given capacity
     * @param capacity board capacity for storing entries
     */
    ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    /**
     * Add a new score to the collection
     * (if it is high enough).
     * @param e the game entry to be added
     */
    void add(GameEntry e) {
        int newScore = e.getScore();

        // is the new entry e really a high score
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            // no score drops from the board
            if (numEntries < board.length) {
                // so overall number increases
                numEntries++;
            }

            // shift any lower scores rightward to make room for the new entry
            int j = numEntries - 1;

            while (j > 0 && board[j - 1].getScore() < newScore) {
                // shift entry from j-1 to j
                board[j] = board[j - 1];
                j--;
            }

            // when done, add new entry
            board[j] = e;
        }
    }

    /**
     * Remove and return the high score at a given index
     * @param index the index parameter
     * @return the high score at that index
     * @throws IndexOutOfBoundsException when supplied index is out of bounds
     */
    GameEntry remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        // save the object to be removed
        GameEntry temp = board[index];

        // update content of board
        for (int i = index; i < numEntries - 1; i++) {
            // move each cell to the left
            board[i] = board[i + 1];
        }
        // null out the last score
        board[numEntries - 1] = null;
        numEntries--;

        return temp;
    }

    /**
     * Return a string representation of the high scores list
     * @return this score board as a string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int j = 0; j < numEntries; j++) {
            if (j > 0) {
                // separate entries by commas
                sb.append(", ");
            }
            sb.append(board[j]);
        }
        sb.append("]");
        return sb.toString();
    }
}
