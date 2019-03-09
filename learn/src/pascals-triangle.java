class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows < 1) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        inner.add(1);
        result.add(inner);
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> newInner = new ArrayList<>();
            if (inner.size() == 1) {
                newInner.add(1);
                newInner.add(1);   
            } else {
                for (int j = 0; j <= inner.size(); j++) {
                    if (j == 0 || j == inner.size()) {
                        newInner.add(1);
                    } else {
                        newInner.add(inner.get(j - 1) + inner.get(j));
                    }
                }
            }
            inner = newInner;
            result.add(inner);
        }
        return result;
    }
}
