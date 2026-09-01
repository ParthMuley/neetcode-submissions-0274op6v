class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), 0, result);
        return result;
    }
    
    private void backtrack(int[] candidates, int target, int start, List<Integer> current, int sum, List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (sum > target || start == candidates.length) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(candidates, target, i, current, sum + candidates[i], result); 
            current.remove(current.size() - 1);
        }
    }
}
