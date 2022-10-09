class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        String s2=s+s;
        return (s2.contains(goal));
    }
}

//  with A = "abcde", B = "cdeab", we have

// “abcdeabcde” (A + A)
//   “cdeab” (B)
// B is found in (A + A), so B is a rotated string of A.