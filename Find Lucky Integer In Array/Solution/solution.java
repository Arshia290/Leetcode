class Solution {
    public int findLucky(int[] arr) {
        int result = -1;
        for (int num : arr){
            int target = num;
            int count = 0;
            for (int i = 0; i < arr.length; i++){
                if(arr[i] == target){
                    count++;
                }
            }
            if(count == target && target > result) result = target;
        }
        return result;
    }
}
