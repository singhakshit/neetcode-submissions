class MedianFinder {

    PriorityQueue<Integer> minHeap; // store bigger number
    PriorityQueue<Integer> maxHeap; // store smaller number

    public MedianFinder() {
        minHeap = new PriorityQueue<Integer>();
        maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
    }
    
    public void addNum(int num) {
        if (maxHeap.isEmpty()) {
            maxHeap.offer(num);
            return;
        }

        if (num > maxHeap.peek()) {
            minHeap.offer(num);
            if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.offer(minHeap.poll());
            }
        } else {
            maxHeap.offer(num);
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            }
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return (double) maxHeap.peek();
        } else if (maxHeap.size() < minHeap.size()) {
            return (double) minHeap.peek();
        } else {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */