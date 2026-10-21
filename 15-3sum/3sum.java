class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // if (nums[i] > 0) {
            //     break; // Remaining values are also positive.
            // }

            int target = -nums[i];
            res.addAll(twoSum(nums, target, i + 1, nums.length - 1));
        }

        return res;
    }

    private List<List<Integer>> twoSum(int[] nums, int target, int left, int right) {
        List<List<Integer>> ans = new ArrayList<>();

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                ans.add(Arrays.asList(-target, nums[left], nums[right]));

                int leftValue = nums[left];
                int rightValue = nums[right];

                while (left < right && nums[left] == leftValue) left++;
                while (left < right && nums[right] == rightValue) right--;
            }
        }

        return ans;
    }
}
