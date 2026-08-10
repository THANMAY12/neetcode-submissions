class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l=new int[nums.length];
        Arrays.fill(l,1);
        
        int n=nums.length;
        int []r =new int[nums.length];Arrays.fill(r,1);
        for(int i=1;i<n;i++){
            l[i]=nums[i-1]*l[i-1];
            r[n-i-1]=nums[n-i]*r[n-i];
        }
        for(int i=0;i<n;i++){
            //System.out.println(r[i]+" "+l[i]);
            r[i]*=l[i];
        }
        return r;
    }
}  
