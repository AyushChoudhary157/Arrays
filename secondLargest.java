// Second Largest
// Difficulty: EasyAccuracy: 26.72%Submissions: 737K+Points: 2
// Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

// Examples:

// Input: arr = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.
// Input: arr = [10, 10]
// Output: -1
// Explanation: The largest element of the array is 10 and the second largest element does not exist..
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 2 ≤ arr.size() ≤ 105
// 1 ≤ arr[i] ≤ 105

// Company Tags
// SAP LabsRockstand


class Solution {
    public int print2largest(int[] arr) {
        // Code Here
        int largest = arr[0];
        int slargest = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
                
            }
        
        }
        return slargest;
    }
}

