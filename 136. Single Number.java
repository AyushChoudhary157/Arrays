// 136. Single Number

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]
// Output: 1
// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:

// Input: nums = [1]
// Output: 1
 

// Constraints:

// 1 <= nums.length <= 3 * 104
// -3 * 104 <= nums[i] <= 3 * 104

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int num = nums[i];
            int cnt = 0;

            for(int j=0; j<n; j++){
                if(nums[j] == num){
                    cnt++;
                }
            }
            if(cnt == 1){
                return num;
            }
        }
        return -1;
    }
}
