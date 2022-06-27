class Solution {
    public String restoreString(String s, int[] indices) {
     char[] st = new char[indices.length];
       for(int i =0;i<indices.length;i++)
       {
           st[indices[i]] = s.charAt(i);
       }
        return new String(st);
    }
}
