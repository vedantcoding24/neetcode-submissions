class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        // int i=0;
        // int j=nums.length-1;
        // while(i<j){
        //     if(nums[i]+nums[j]==target){
        //         return new int[]{i, j};
        //     }else if(nums[i]+nums[j]>target){
        //         j--;
        //     }else{
        //         i++;
        //     }
        // }

        // return new int[]{-1, -1};

        for(int i=0; i<nums.length; i++){
            //map.put(i, nums[i]);
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
    return new int[]{-1, -1};
}
}
