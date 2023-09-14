package prepDay.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueQ {
    public static void main(String[] args) {
        int[] nums = {11,3,2,4,56,7,8,8};

        int k = 4;
        findKthLargest(nums,k);
    }

        public static void findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
//            for(int i = 0; i< nums.length;i++){
//                pq.add(nums[i]);
//            }
            for(int i =0; i< nums.length;i++){
                pq.add(nums[i]);
            }
            System.out.println(pq);
            System.out.println("dasdsa");
            while(!pq.isEmpty()){
                System.out.print(pq.poll() + " ");
            }
//            System.out.println("Print PQ");
//            for(int i =0; i< pq.size(); i++){
//                pq.poll();
//            }
////            System.out.println(pq);
//            for(int i = k; i < nums.length; i++){
//                if(pq.peek()<nums[i]){
//                    pq.poll();
//                    pq.add(nums[i]);
//                }
//            }
//            return pq.peek();

    }
}
