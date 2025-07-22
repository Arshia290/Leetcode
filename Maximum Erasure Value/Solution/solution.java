class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        int pt1 = 0;
        int pt2 = 0;
        int sum = 0;
        int maxSum = 0;

        while(pt2 < nums.length){

            while (map.containsKey(nums[pt2])) {
            map.remove(nums[pt1]);
            sum -= nums[pt1];
            pt1++;
        }
            sum += nums[pt2];
            map.put(nums[pt2],pt2);
            pt2++;
            if(sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }
}
