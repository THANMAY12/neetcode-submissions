class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev=0;
        int i=0;
        int next=1;

        int l=flowerbed.length;
        if(n==1 && flowerbed[0]==0 && l==1) return true;
        if(n==1 && flowerbed[0]==1 && l==1) return false;
        
        while(i<l && n>0){
            if(i==0 && flowerbed[next]==0 && flowerbed[i]==0 ){
                flowerbed[i]=1;
                n--;
                
            }
            else if(next==l && flowerbed[prev]==0 && flowerbed[i]==0) {
                flowerbed[i]=1;
                n--;
            }
            else if(flowerbed[prev]==0 && flowerbed[i]==0 && flowerbed[next]==0){
                flowerbed[i]=1;
                n--;
                
            }
            prev=i;
                i=next;
                next++;
        }
        return n==0;

    }
}