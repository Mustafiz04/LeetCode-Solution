class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        int [] result = new int [length - k + 1];
        int resultIndex = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i=0; i<length; i++) {
            // check for the out of bounds
            while (queue.size() > 0 && queue.peekFirst() <= i-k)
                queue.pollFirst();
            // remove elemnts that are currentlu less than nums[i]
            while (queue.size() > 0 && nums[queue.peekLast()] < nums[i])
                queue.pollLast();
            queue.offerLast(i);
            if (i >= k - 1)
                result[i - k + 1] = nums[queue.peekFirst()];
        }
        return result;
    }
}