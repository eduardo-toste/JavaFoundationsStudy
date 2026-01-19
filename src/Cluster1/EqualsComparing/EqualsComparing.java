package Cluster1.EqualsComparing;

import java.util.Scanner;

public class EqualsComparing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (primitive int): ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter second number (type a number or `null`): ");
        String secondInput = scanner.nextLine().trim();

        Integer secondNumber = null;
        if (!secondInput.equalsIgnoreCase("null")) {
            try {
                secondNumber = Integer.valueOf(Integer.parseInt(secondInput));
            } catch (NumberFormatException e) {
                System.out.println("Invalid second number.");
                return;
            }
        }

        System.out.println("\nValues:");
        System.out.println("firstNumber (int) = " + firstNumber);
        System.out.println("secondNumber (Integer) = " + secondNumber);

        System.out.println("\nComparisons:");
        try {
            System.out.println("firstNumber == secondNumber -> " + (firstNumber == secondNumber));
        } catch (NullPointerException e) {
            System.out.println("firstNumber == secondNumber -> throws NullPointerException (unboxing null)");
        }

        // identity and value comparisons between wrappers
        Integer x = Integer.valueOf(firstNumber);
        Integer y = (secondNumber == null) ? null : Integer.valueOf(secondNumber.intValue());
        System.out.println("Integer.valueOf(firstNumber) == Integer.valueOf(secondNumber) -> " + (x == y));
        System.out.println("x.equals(y) -> " + (y == null ? "false (y is null)" : x.equals(y)));
        System.out.println("java.util.Objects.equals(x, y) -> " + java.util.Objects.equals(x, y));

        // illustrate caching for same value
        Integer a = Integer.valueOf(firstNumber);
        Integer b = Integer.valueOf(firstNumber);
        System.out.println("For same literal values: Integer.valueOf(firstNumber) identity (a == b) -> " + (a == b));
        System.out.println("a.equals(b) -> " + a.equals(b));

    }

}
