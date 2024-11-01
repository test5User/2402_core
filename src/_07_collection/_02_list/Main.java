package _07_collection._02_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(19);
        list.add(20);
        list.add(25);
        list.forEach(System.out::println);
        //list.remove(20);
        System.out.println("___________________________");
        list.remove(new Integer(20));
        list.forEach(System.out::println);
    }
}
