import java.util.*;
class minnoperations {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int ans = 0;

        for(int n : nums)
            pq.offer((long) n);

        while(pq.size() > 1 && pq.peek() < k) {
            long x = pq.poll();
            long y = pq.poll();

            pq.offer(Math.min(x, y) * 2 + Math.max(x, y));
            ans++;
        }
        return ans;
    }
}