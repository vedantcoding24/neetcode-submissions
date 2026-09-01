class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        //using bucket sort
        List<Integer>[] bucket = new List[nums.length+1]; //Array of List eg int[] b = new int[];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
           map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            int frequency=map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int counter=0;
        for(int pos=bucket.length-1; pos>=0 && counter<k; pos--){
            if(bucket[pos]!=null){
                for(Integer i:bucket[pos]){
                    ans[counter++]=i;
                }
            }
        }
      return ans;
    }
}
