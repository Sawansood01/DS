class Solution {
    public String firstPalindrome(String[] words) {
//         int n = words.length;
//        for(String s : words)
//        {
//            if(isit(s))
//                return s;
          
//        }
//         return "";
//     }
//     public boolean isit(String word)
//     {
//         for(int i =0;i<word.length()/2;i++)
//         {
//             if(word.charAt(i) == word.charAt(word.length()-i-1))
//                 return true;
//         }
//         return false;
//     }
// }
        
        
              for(String s : words){
            if(isIt(s))return s;
        }
        return "";
    }
    public boolean isIt(String word){
        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i))return false;
        }
        return true;
    }
}