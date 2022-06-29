class Solution {
    public String sortSentence(String s) {
        	String[] str = s.split(" ");               
	String[] res = new String[str.length];
        for(String st: str){
            res[st.charAt(st.length()-1)-'1']=st.substring(0,st.length()-1);
        }
        return String.join(" ",res);
    }
}