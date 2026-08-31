class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] count=new int[26];
            for(char ch:s.toCharArray()){
                count[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<26; i++){
               sb.append('#');
               sb.append(count[i]);
            }
            map.computeIfAbsent(sb.toString(), v->new ArrayList<>())
            .add(s);
        }
       return new ArrayList<>(map.values());
    }
}
