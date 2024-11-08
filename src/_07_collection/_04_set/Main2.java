package _07_collection._04_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        var fishes = new HashSet<Fish>();
        var f1 = new Fish("Пенка", 1);
        var f2 = new Fish("Волна", 2);
        var f3 = new Fish("Солнышко", 1);
        var f4 = new Fish("Ветерок", 3);
        var f5 = new Fish("Коралл", 8);
        fishes.add(f1);
        fishes.add(f2);
        fishes.add(f3);
        fishes.add(f4);
        fishes.add(f5);
        System.out.println(fishes);
//        f1.setAge(2);
//        for (Fish fish : fishes) {
//            if (fish.getName().equals(f1.getName())) {
//                fishes.remove(f1);
//            }
//        }
        //fishes.remove(f1);
//        var it = fishes.iterator();
//        if (it.hasNext()) {
//           var f = it.next();
//           if (f.getName().equals(f1.getName())) {
//               it.remove();
//           }
//        }
//        System.out.println(fishes);
        var fishes1 = new LinkedHashSet<Fish>();
        fishes1.add(f1);
        fishes1.add(f2);
        fishes1.add(f3);
        fishes1.add(f4);
        fishes1.add(f5);
        f1.setAge(2);
        fishes1.remove(f1);
        System.out.println(fishes1);
    }
}
