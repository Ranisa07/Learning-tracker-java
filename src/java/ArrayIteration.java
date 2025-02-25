package java;

public class ArrayIteration {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("for: Element at index " + i + ": " + numbers[i]);
        }

        // for-each loop
        for (int num : numbers) {
            System.out.println("for-each: Element: " + num);
        }

        // while loop
        int i = 0;
        while (i < numbers.length) {
            System.out.println("while: Element at index " + i + ": " + numbers[i]);
            i++;
        }

        // do-while loop
        i = 0;
        do {
            System.out.println("do-while: Element at index " + i + ": " + numbers[i]);
            i++;
        } while (i < numbers.length);
    }
}
