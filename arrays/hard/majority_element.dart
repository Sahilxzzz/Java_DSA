class Solution {
  List<int> majorityElement(List<int> nums) {
    List<int> list = [];
    Map<int, int> map = {};
    int n = nums.length;
    int min = (n ~/ 3) + 1;

    for (int i = 0; i < n; i++) {
      map[nums[i]] = (map[nums[i]] ?? 0) + 1;
      if (map[nums[i]] == min) {
        list.add(nums[i]);
      }
    }
    return list;
  }
}
