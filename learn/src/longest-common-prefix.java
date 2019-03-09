class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        
        String result = strs[0];
        int min = strs[0].length();
        
        for (String str : strs){
            if (str.length() < min) {
                min = str.length();
                result = str;
            }
        }
        
        for (String str : strs) {
            while (!result.equals(str.substring(0, result.length())) && !result.equals("")) {
                result = result.substring(0, result.length() - 1);
            }
        }

        return result;
    }
}
