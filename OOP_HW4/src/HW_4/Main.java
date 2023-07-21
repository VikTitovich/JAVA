package HW_4;

import HW_4.linkedlist.list.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> customlist = new LinkedList<>();
        customlist.add(123)
                .add(234)
                .add(345)
                .add(456)
                .add(567,678);
        System.out.println(customlist);

        customlist.addFirst(1);
        customlist.addLast(6);
        System.out.println(customlist);

        customlist.remove(2);
        System.out.println(customlist);

        customlist.removeFirst();
        System.out.println(customlist);

        customlist.removeLast();
        System.out.println(customlist);

        customlist.update(1, 10);
        System.out.println(customlist);

        System.out.println("List size: " + customlist.size());
        System.out.println("List element: " + customlist.get(2));
    }
}
