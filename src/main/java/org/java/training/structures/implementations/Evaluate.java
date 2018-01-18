package org.java.training.structures.implementations;

import java.util.Scanner;
import java.util.Stack;

/**
 * Dijkstra's Two-Stack Algorithm for Expression Evaluation
 *
 * Implementation example of arithmetic expression evaluation.
 *
 * Recursive definition:
 *      an arithmetic expression is either a number, or a left parenthesis
 *      followed by an arithmetic expression followed by an operator
 *      followed by another arithmetic expression followed by a right parenthesis.
 *
 * Evaluates (fully parenthesized) arithmetic expressions using
 *  Dijkstra's two-stack algorithm.
 *
 *  % java Evaluate
 *  ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) EOL
 *  101.0
 *
 *  % java Evaluate
 *  ( ( 1 + sqrt ( 5 ) ) / 2.0 ) EOL
 *  1.618033988749895
 *
 *
 *  Note: the operators, operands, and parentheses must be
 *  separated by whitespace. Also, each operation must
 *  be enclosed in parentheses. For example, you must write
 *  ( 1 + ( 2 + 3 ) ) instead of ( 1 + 2 + 3 ).
 *  See EvaluateDeluxe.java for a fancier version.
 *
 *
 *  Remarkably, Dijkstra's algorithm computes the same
 *  answer if we put each operator *after* its two operands
 *  instead of *between* them.
 *
 *  % java Evaluate
 *  ( 1 ( ( 2 3 + ) ( 4 5 * ) * ) + ) EOL
 *  101.0
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 *
 * @author Solange U. Gasengayire
 */
public class Evaluate {

    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String inStr = scanner.next();
            boolean isOperator =
                    inStr.equals("+")
                            || inStr.equals("-")
                            || inStr.equals("*")
                            || inStr.equals("/")
                            || inStr.equals("sqrt");

            if (inStr.equals("(")) {

                // do nothing
            } else if (isOperator) {

                // push operator to ops stack
                ops.push(inStr);

            } else if (inStr.equals(")")) {

                // pop, evaluate and push result onto vals stack
                String op = ops.pop();
                double val = vals.pop();

                switch (op) {
                    case "+":
                        val = vals.pop() + val;
                        break;
                    case "-":
                        val = vals.pop() - val;
                        break;
                    case "*":
                        val = vals.pop() * val;
                        break;
                    case "/":
                        val = vals.pop() / val;
                        break;
                    case "sqrt":
                        val = Math.sqrt(val);
                        break;
                }

                vals.push(val);

            } else {
                if (! inStr.contains("EOL")) {
                    // we're dealing with a value here
                    vals.push(Double.parseDouble(inStr));
                } else {
                    // we've encountered the operation delimiter
                    break;
                }
            }
        }

        scanner.close();
        System.out.println("Result = " + vals.pop());
    }

}
