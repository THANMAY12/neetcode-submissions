class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        
        s=s.toLowerCase().replace(" ","").replace("?","");
        int r=s.length()-1;

        while(l<r){
            System.out.println(s.charAt(l)+" "+s.charAt(r));
            if(!Character.isLetterOrDigit(s.charAt(l))) l++;
            else if(!Character.isLetterOrDigit(s.charAt(r))) r--;
            else if(s.charAt(l)==s.charAt(r)) {
                l++;
                r--;
            }
            else return false;
        }
        return true;
    }
}
