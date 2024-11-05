package _07_collection._03_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //Добавление елемента в очередь
        queue.add("First");
        queue.offer("Second");
        queue.offer("Third");
        queue.offer("Forth");
        queue.offer("Fifth");
        System.out.println(queue);
        //Удаление элемента из головы очереди
        String element = queue.remove();
        System.out.println("Element: " + element);
        System.out.println(queue);
        //Удаление элемента из любого места очереди (это метод Collection)
        queue.remove("Forth");
        System.out.println(queue);
        //Возвращение элемента из головы очереди и не удаляет его
        System.out.println(queue.element());
        System.out.println(queue.peek());
        //Удаление элемента из головы очереди
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.add(null);
        System.out.println(queue);
    }
}
