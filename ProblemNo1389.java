import java.util.Arrays;

public class ProblemNo1389 {

        public void createTargetArray(int[] nums, int[] index) {
            int[] targetArray = new int[nums.length];
            Arrays.fill(targetArray, -1);
            System.out.println(Arrays.toString(targetArray));

            // 1nd loop and direct access of second loop
            for(int i=0;i<index.length;i++){
                if(targetArray[index[i]] == -1){
                    targetArray[index[i]] = nums[i];
                    System.out.println(Arrays.toString(targetArray));
                } else {
                    shiftArray(targetArray , index[i]);
                    targetArray[index[i]] = nums[i];
                }
            }

            System.out.println(Arrays.toString(targetArray));
        }

        // Shift Array
        public  void shiftArray(int[] array, int index){

            int tempOuter = 0;
            for(int i=index;i<array.length;i++){
                int temp = array[i];
                array[i]=tempOuter;
                tempOuter = temp;
            }
        }


        //Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        //Output: [0,4,1,3,2]

        public static void main(String[] args) {
            ProblemNo1389 problemno1389 = new ProblemNo1389();

            // input 1
            int[] nums = {0,1,2,3,4};
            int[] index = {0,1,2,2,1};

            problemno1389.createTargetArray(nums,index);


            // input 2
            int[] nums2 =  {0,1,0};
            int[] index2 = {0,1,0};
            problemno1389.createTargetArray(nums2,index2);
        }
    }


