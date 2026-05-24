class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curnum=num;
                int count=1;

                while(set.contains(curnum+1)){
                    curnum++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
