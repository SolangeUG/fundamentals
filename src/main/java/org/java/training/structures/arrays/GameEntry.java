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
 * GameEntry represents the score and the person earning that score in a game.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 *
 * @author Solange U. Gasengayire
 */
class GameEntry {

    // name of person earning the score
    private String name;
    // the score value
    private int score;

    /**
     * Create a game entry with given parameters
     * @param name name of player
     * @param score their score value
     */
    GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Return this entry's player
     * @return player's name
     */
    String getName() {
        return this.name;
    }

    /**
     * Return this entry's score
     * @return player's score
     */
    int getScore() {
        return this.score;
    }

    /**
     * Return a string representation of a game entry
     * @return this object as a string
     */
    @Override
    public String toString() {
        return "(" + name + ", " + score + ")";
    }
}
