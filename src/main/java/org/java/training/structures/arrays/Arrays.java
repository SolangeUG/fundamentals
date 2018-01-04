package org.java.training.structures.arrays;

/**
 * Tester class for the ScoreBoard example
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 *
 * @author Solange U. Gasengayire
 */
public class Arrays {

    /**
     * Main tester method
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ScoreBoard highScores = new ScoreBoard(5);
        String[] names = {"Rob", "Mike", "Rose", "Jill", "Jack", "Anna", "Paul", "Bob"};
        int[] scores = {750, 1105, 590, 740, 510, 660, 720, 400};

        for (int i=0; i < names.length; i++) {
            GameEntry gE = new GameEntry(names[i], scores[i]);
            System.out.println("Adding " + gE);
            highScores.add(gE);
            System.out.println(" Scoreboard: " + highScores);
        }

        System.out.println("\nRemoving score at index " + 3);
        highScores.remove(3);
        System.out.println(" Scoreboard: " + highScores);

        System.out.println("Removing score at index " + 0);
        highScores.remove(0);
        System.out.println(" Scoreboard: " + highScores);

        System.out.println("Removing score at index " + 1);
        highScores.remove(1);
        System.out.println(" Scoreboard: " + highScores);

        System.out.println("Removing score at index " + 1);
        highScores.remove(1);
        System.out.println(" Scoreboard: " + highScores);

        System.out.println("Removing score at index " + 0);
        highScores.remove(0);
        System.out.println(" Scoreboard: " + highScores);
    }
}
