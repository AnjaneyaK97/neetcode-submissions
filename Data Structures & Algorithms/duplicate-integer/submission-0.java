class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int i:nums){
            if(!map.add(i)){
                return true;
            }
        }
        return false;
    }
}