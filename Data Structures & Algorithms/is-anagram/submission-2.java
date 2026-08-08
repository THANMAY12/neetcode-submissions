class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> ar1=new ArrayList<>();
        ArrayList<Character> ar2=new ArrayList<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            ar1.add(s.charAt(i));
            ar2.add(t.charAt(i));
        }
        Collections.sort(ar1);
        Collections.sort(ar2);
        for(int i=0;i<ar1.size();i++){
            if(ar1.get(i)!=ar2.get(i)) return false;
        }
        return true;
    }
}
