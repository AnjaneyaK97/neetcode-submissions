class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> map=new HashMap<>();
        for(String s:strs){
            int a[]=new int[26];
            for(char ch:s.toCharArray()){
                a[ch-'a']++;
            }
            StringBuilder key=new StringBuilder();
            for(int i=0;i<a.length;i++){
                key.append("#");
                key.append(a[i]);
            }
            map.putIfAbsent(key.toString(),new ArrayList<>());
            map.get(key.toString()).add(s);
        }
        return new ArrayList(map.values());
        
    }
}
