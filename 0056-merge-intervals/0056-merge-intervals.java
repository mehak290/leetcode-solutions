class Solution {
    public int[][] merge(int[][] a) {

        Arrays.sort(a, (x, y) -> x[0] - y[0]);

        List<int[]> ans = new ArrayList<>();

        for (int[] cur : a) {

            if (ans.isEmpty()) {
                ans.add(cur);
            }
            else {
                int[] last = ans.get(ans.size() - 1);

                if (cur[0] <= last[1]) {
                    last[1] = Math.max(last[1], cur[1]);
                }
                else {
                    ans.add(cur);
                }
            }
        }

        return ans.toArray(new int[0][]);
    }
}