class Solution {
    public boolean isAnagram(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean res = Arrays.equals(a,b);
        if(res == true)
            return true;
        else
            return false;
    }
}