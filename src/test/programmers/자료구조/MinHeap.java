package test.programmers.자료구조;

import java.util.ArrayList;

public class MinHeap {

    private ArrayList<Integer> heap;

    public MinHeap(){
        heap = new ArrayList<>();
        heap.add(0);
    }

    public void insert(int num) {
        heap.add(num);
        int idx = heap.size() - 1;

        while (idx > 1 && heap.get(idx) < heap.get(idx / 2)) {
            int temp = heap.get(idx/2);
            heap.set(idx/2, heap.get(idx));
            heap.set(idx, temp);
            idx /= 2;
        }
    }

    public int delete() {
        if (heap.size() <= 1) {
            return -1;
        }

        int data = heap.get(1);
        heap.set(1, heap.get(heap.size() -1));
        heap.remove(heap.size() - 1);

        int idx = 1;

        while( idx*2 < heap.size() ){

            if (idx * 2 + 1 > heap.size()) {
                if (heap.get(idx) < heap.get(idx * 2)) {
                    break;
                } else {
                    int temp = heap.get(idx * 2);
                    heap.set(idx * 2, heap.get(idx));
                    heap.set(idx, temp);
                    break;
                }
            }

            if (heap.get(idx) < heap.get(idx * 2) && heap.get(idx) < heap.get(idx * 2 + 1)) break;
            if (heap.get(idx * 2) < heap.get(idx * 2 + 1)) {
                int temp = heap.get(idx * 2);
                heap.set(idx * 2, heap.get(idx));
                heap.set(idx, temp);
                idx = idx * 2;
            } else {
                int temp = heap.get(idx * 2 + 1);
                heap.set(idx * 2 + 1, heap.get(idx));
                heap.set(idx, temp);
                idx = idx * 2 + 1;
            }

        }
        System.out.println("data = " + data);
        return data;
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();

        heap.insert(9);
        heap.insert(3);
        heap.insert(2);
        heap.insert(6);
        heap.insert(8);

        heap.delete();
        heap.delete();
        heap.delete();
        heap.delete();
        heap.delete();
    }
}
