package statck_Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class s347 {
}


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);  //getOrDefault 是寻找key 的 value 如果不存在就为0
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1,pair2)->pair1[1]-pair2[1]);
        for (Map.Entry<Integer, Integer> entry:map.entrySet()){
            if (pq.size() < k){
                pq.add(new int[]{entry.getKey(), entry.getValue()});
            }else{
                if (entry.getValue() > pq.peek()[1]){
                    pq.poll();
                    pq.add(new int[]{entry.getKey(), entry.getValue()});
                }
            }
        }
        int []ans = new int[k];
        for (int i = 0; i < k; i ++){
            ans[i] = pq.poll()[0];
        }
        return ans;
    }
}