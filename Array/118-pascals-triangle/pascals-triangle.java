class Solution {

    private List<Integer> generateRow(int n) {
        int ans = 1;

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= n; i++) {
            ans = ans * (n - i + 1);
            ans = ans / i;

            row.add(ans);
        }

        return row;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            triangle.add(generateRow(i));
        }

        return triangle;
    }
}
