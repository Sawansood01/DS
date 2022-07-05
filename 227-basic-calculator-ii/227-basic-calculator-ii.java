class Solution {
    public int calculate(String s) {
         Stack<Integer> stack = new Stack<>();
        int len = s.length();
        int num = 0;
        char sign = '+';
         int res = 0;
        for(int i = 0; i< len; i++) {
            char crrnum = s.charAt(i);
            if(Character.isDigit(s.charAt(i))){
                    num = num * 10 + crrnum - '0';
            }
            if(!Character.isDigit(crrnum) && crrnum != ' ' || i == len-1) {
                if(sign == '+') stack.push(num);
                if(sign == '-') stack.push(-num);
                if(sign == '*') stack.push(stack.pop() * num);
                if(sign == '/') stack.push(stack.pop() / num);
                sign = s.charAt(i);
                num = 0;
            }
        }
        for(int i : stack) {
                res += i;
        }
        return res;
    }
}