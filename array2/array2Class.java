public class array2Class {
    

    public int sum13(int[] nums) {
        if(nums.length == 0){
          return 0;
        }
        boolean check13 = (nums[0] == 13);
        int sum = 0;
        sum = check13 ? 0 : nums[0];
        return sum + _sum13(nums, 1, check13);
      }
      
      private int _sum13(int[] nums, int count, boolean check13) {
        if (nums.length == count) {
            return 0;
        }
      
        int sum = 0;
        boolean checkNext13 = (nums[count] == 13);
        if (!check13 && !checkNext13) {
            sum = nums[count];
        }
      
        return sum + _sum13(nums, ++count, checkNext13);
      }
      

      public String[] fizzBuzz(int start, int end) {
  
        int[] valueChain = new int[end - start];
        int j = 0;
        for (int i = start; i < end; i++) {
          valueChain[j++] = i;
        }
        
        String[] returnArr = new String[end-start];
        
        for(int i = 0; i < valueChain.length; i++) {
          if (valueChain[i] % 3 == 0 && valueChain[i] % 5 == 0) {
            returnArr[i] = "FizzBuzz";
          } else if(valueChain[i] % 3 == 0) {
            returnArr[i] = "Fizz";
          } else if (valueChain[i] % 5 == 0) {
            returnArr[i] = "Buzz";
          } else {
            returnArr[i] = String.valueOf(valueChain[i]);
          }
        }
        return returnArr;
      }
      

}
