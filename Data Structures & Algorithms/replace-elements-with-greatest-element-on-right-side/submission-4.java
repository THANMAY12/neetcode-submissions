class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ar[]=new int[n];
        int gre=-1;
        for(int i=n-1;i>=0;i--){
            ar[i]=gre;
            gre=Math.max(arr[i],gre);
        }
        return ar;
    }
}