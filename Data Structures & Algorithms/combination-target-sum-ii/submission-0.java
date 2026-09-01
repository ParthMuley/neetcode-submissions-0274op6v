class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        recur(candidates, target, 0, 0, result, new ArrayList<>());
        return result;
    }
    public void recur(int[] candidates, int target, int index, int sum, List<List<Integer>> result, List<Integer> ls) {
        if (sum == target) {
            result.add(new ArrayList<>(ls));
            return;
        }
        if (sum > target || index >= candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            ls.add(candidates[i]);
            recur(candidates, target, i + 1, sum + candidates[i], result, ls); 
            ls.remove(ls.size() - 1);
        }
    }
}
