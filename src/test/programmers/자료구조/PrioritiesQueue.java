package test.programmers.자료구조;

import java.util.PriorityQueue;

public class PrioritiesQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("add = " + q.poll());
        System.out.println("q = " + q);
        System.out.println("add = " + q.poll());
        System.out.println("q = " + q);
        q.add(5);
        System.out.println("q = " + q);
        System.out.println("add = " + q.poll());
        System.out.println("q = " + q);
        System.out.println("add = " + q.poll());
        System.out.println("q = " + q);
        System.out.println("add = " + q.poll());
        System.out.println("q = " + q);

    }
}
