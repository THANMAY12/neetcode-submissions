class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){

            for(int j=i;j<nums.length;j++){
                if(nums[i]+nums[j]==target&&i!=j){
                    a=i;
                    b=j;
                }
                        }
        }
        return new int[]{a,b};
    }
}
