class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> inner = new ArrayList<>();
        inner.add(1);
        
        for (int i = 0; i < rowIndex; i++) {
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
        }
        return inner;
    }
}
