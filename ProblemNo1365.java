
// 1365. How Many Numbers Are Smaller Than the Current Number
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

// solution : Brute force approach


import java.util.Arrays;

class ProblemNo1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] solutionArr = new int[nums.length] ;

        for(int i=0;i<nums.length;i++){
            int countOfNoLessThan = 0;

            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    countOfNoLessThan++;
                }
            }
            solutionArr[i] = countOfNoLessThan;
        }
        return solutionArr;
    }

    // Class method runner to be removed
    public static void main(String[] args) {
        // To run non-static method in static method we have to
        // create instanceof of the class and then call the method in it.
        ProblemNo1365 solution = new ProblemNo1365();
        int[] nums = {8,1,2,2,3};
        int[] solToPrint = solution.smallerNumbersThanCurrent(nums);


        // Input: nums = [8,1,2,2,3]
        // Output: [4,0,1,1,3]
        System.out.println(Arrays.toString(solToPrint));
    }
}