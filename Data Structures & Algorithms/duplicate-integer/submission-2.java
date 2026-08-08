
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mp=new HashSet<>();
        for(int i:nums){
            mp.add(i);
        }
        return mp.size()!=nums.length;
    }
}