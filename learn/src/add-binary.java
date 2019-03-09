class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int aInt = i < 0 ? 0 : a.charAt(i) - '0';
            int bInt = j < 0 ? 0 : b.charAt(j) - '0';

            int val = (aInt + bInt + carry) % 2;
            carry = (aInt + bInt + carry) / 2;
            
            result.insert(0, (char)(val + '0'));
        }
        if (carry == 1) {
            result.insert(0, '1');
        }
        return result.toString();
    }
}
