class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int num2[]=new int[2*n];
        for(int i=0;i<2*n;i++){
            System.out.println(i%n);
            num2[i]=nums[i%n];
        }
        return num2;
    }
}