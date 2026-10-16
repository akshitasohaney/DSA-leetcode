class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        generate(0, nums, current, ans);

        return ans;
    }

    private void generate(int index, int[] nums,
                          List<Integer> current,
                          List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: Include the current element
        current.add(nums[index]);
        generate(index + 1, nums, current, ans);

        // Backtrack: Remove the current element
        current.remove(current.size() - 1);

        // Choice 2: Exclude the current element
        generate(index + 1, nums, current, ans);
    }
}
        
    
