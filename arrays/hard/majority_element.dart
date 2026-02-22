// class Solution {
//   List<int> majorityElement(List<int> nums) {
//     List<int> list = [];
//     Map<int, int> map = {};
//     int n = nums.length;
//     int min = (n ~/ 3) + 1;

//     for (int i = 0; i < n; i++) {
//       map[nums[i]] = (map[nums[i]] ?? 0) + 1;
//       if (map[nums[i]] == min) {
//         list.add(nums[i]);
//       }
//     }
//     return list;
//   }
// }

class Solution {
  List<int> majorityElement(List<int> nums) {
    List<int> list = [];
    int n = nums.length;
    int min = (n ~/ 3) + 1;

    int cnt1 = 0, cnt2 = 0;
    int el1 = -1 << 31, el2 = -1 << 31; // Dart equivalent for Integer.MIN_VALUE

    for (int i = 0; i < n; i++) {
      if (cnt1 == 0 && el2 != nums[i]) {
        cnt1 = 1;
        el1 = nums[i];
      } else if (cnt2 == 0 && el1 != nums[i]) {
        cnt2 = 1;
        el2 = nums[i];
      } else if (el1 == nums[i]) {
        cnt1++;
      } else if (el2 == nums[i]) {
        cnt2++;
      } else {
        cnt1--;
        cnt2--;
      }
    }

    cnt1 = 0;
    cnt2 = 0;
    for (int i = 0; i < n; i++) {
      if (el1 == nums[i]) {
        cnt1++;
      }
      if (el2 == nums[i]) {
        cnt2++;
      }
    }

    if (cnt1 >= min) list.add(el1);
    if (cnt2 >= min && el2 != el1) list.add(el2);

    return list;
  }
}
