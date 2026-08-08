class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int num2[]=new int[2*n];
        for(int i=0;i<n;i++){
            num2[i]=nums[i];
            num2[n+i]=nums[i];
        }
        return num2;
    }
}