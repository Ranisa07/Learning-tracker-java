package java;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList: " + linkedList);

        // Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(40);
        vector.add(50);
        vector.add(60);
        System.out.println("Vector: " + vector);

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(80);
        stack.push(90);
        System.out.println("Stack: " + stack);
        stack.pop();
        System.out.println("Stack after pop: " + stack);

        // Queue (using LinkedList as Queue implementation)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(110);
        queue.add(120);
        System.out.println("Queue: " + queue);
        queue.poll();
        System.out.println("Queue after poll: " + queue);
    }
}
