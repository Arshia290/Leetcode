class Solution {
    public int countHillValley(int[] nums) {

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums2.add(nums[i]);
            }
        }

        int count = 0;
        for (int i = 1; i < nums2.size() - 1; i++) {
            int prev = nums2.get(i - 1);
            int curr = nums2.get(i);
            int next = nums2.get(i + 1);

            if (curr > prev && curr > next) {
                count++;
            } else if (curr < prev && curr < next) {
                count++;
            } 
        }
        return count;  
    }
}
