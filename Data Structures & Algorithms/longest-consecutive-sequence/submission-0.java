class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest=0;

        for(int num:nums){
            set.add(num);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int currentLength=1;

                while(set.contains(current+1)){
                    current++;
                    currentLength++;
                }
                longest=longest>currentLength?longest:currentLength;
            }
    
        }

        return longest;
    }
}
