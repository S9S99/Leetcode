class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int max = haystack.length() - needle.length() + 1;
        for (int i = 0; i < max; i++) {
            while (i < max && haystack.charAt(i) != needle.charAt(0)) {
                i++;
            }   
            
            int count = 0;
            int j = 0;
            
            while (j < needle.length() && i < max && needle.charAt(j) == haystack.charAt(i+j)) {
                count++;
                j++;
            }
            if (count == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}
