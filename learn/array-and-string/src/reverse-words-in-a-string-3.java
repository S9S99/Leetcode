class Solution {
    public String reverseWords(String s) {
        if (s.trim().isEmpty()) {
		    return s.trim();
        }
	    StringBuffer result = new StringBuffer();   	
        String[] words = s.trim().split("[ ]+");

        for (int i = 0; i < words.length; i++) {
            char[] charArray = words[i].toCharArray();
            for (int j = 0; j < charArray.length / 2; j++) {
                char tmp = charArray[j];
                charArray[j] = charArray[charArray.length - 1 - j];
                charArray[charArray.length - 1 - j] = tmp;
            }
    	    result.append(String.valueOf(charArray)).append(" ");
        }
        return result.toString().trim();
    }
}
