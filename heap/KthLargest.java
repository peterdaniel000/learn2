package heap;
import java.util.PriorityQueue;

 class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums){
        this.k = k;
        this.minHeap = new PriorityQueue<>();

        for (int num : nums){
            add(num);
        }
    }

    public int add(int val){
        if (minHeap.size() < k){
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}
