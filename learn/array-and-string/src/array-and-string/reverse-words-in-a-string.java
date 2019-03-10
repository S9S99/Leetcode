class Solution {
    public String reverseWords(String s) {
        if (s.trim().isEmpty()) {
		    return s.trim();
        }
	    StringBuffer result = new StringBuffer();   	
        String[] words = s.trim().split("[ ]+");

        for (int i = words.length - 1; i >= 0; i--) {
    	    result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }
}
