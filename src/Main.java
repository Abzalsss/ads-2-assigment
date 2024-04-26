import Package.MyArrayList;
import Package.MyList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<Integer>();

        arr.add(0, 1);
        arr.addLast(2);
        arr.addFirst(0);

        System.out.println("First element: " + arr.getFirst());
        System.out.println("Last element: " + arr.getLast());
        System.out.println("Element at index 1: " + arr.get(1));

        arr.removeFirst();
        arr.removeLast();
        arr.remove(0);
        //System.out.println(arr.sort());
        //System.out.println(arr.indexOf());
        //arr.lastIndexOf();

        System.out.println("Size: " + arr.size());

        System.out.println("Does list exist 1? " + arr.exists(1));

        arr.add(0, 10);
        arr.add(1, 20);
        arr.clear();
        //arr.set();
        System.out.println("Size after clearing: " + arr.size());

    }
}
