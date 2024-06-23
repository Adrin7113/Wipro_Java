package module_1.section_3;

import utils.Printer;

import java.util.PriorityQueue;

public class Assignment_M1_S3_5 {
    public void answer(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (a, b) -> b - a);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        int min=0, max=0;

        for(int num: arr){
            maxHeap.add(num);
            minHeap.add(num);
        }

        for (int i = 0; i < k; i++) {
            if (!minHeap.isEmpty()) {
                min = minHeap.poll();
            }
            if (!maxHeap.isEmpty()){
                max = maxHeap.poll();
            }
        }

        Printer.println("Max: " + max + "\nMin: "+ min);
    }
}
