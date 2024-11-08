package _07_collection._03_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main1 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        //Добавление в голову очереди
        deque.push("First");
        deque.addFirst("Second");
        deque.offerFirst("Third");
        System.out.println(deque);
        //Извлечение первого элемента из головы не удаляя
        System.out.println(deque.getFirst());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        //Добавление в хвост очереди
        deque.add("Forth");
        deque.addLast("Fifth");
        deque.offer("Seventh");
        deque.offerLast("Eight");
        System.out.println(deque);
        //Извлечение первого элемента из хвоста не удаляя
        System.out.println(deque.getLast());
        System.out.println(deque.peekLast());
        System.out.println(deque);
        //Извлечение первого элемента из хвоста удаляя из коллекции
        System.out.println(deque.pollLast());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        //Извлечение первого элемента из головы удаляя из коллекции
        System.out.println(deque.pollFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.poll());
        System.out.println(deque);
        deque.add("Forth");
        deque.add("Sixth");
        System.out.println(deque);
        //deque.removeFirstOccurrence("Forth");
        deque.removeLastOccurrence("Forth");
        System.out.println(deque);
    }
}
