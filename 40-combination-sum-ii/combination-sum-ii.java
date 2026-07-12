class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), list);
        return list;
    }

    public void solve(int[] arr, int target, int start, List<Integer> temp, List<List<Integer>> list) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) continue;

            if (arr[i] > target) break;

            temp.add(arr[i]);

            solve(arr, target - arr[i], i + 1, temp, list);

            temp.remove(temp.size() - 1);
        }
    }
}