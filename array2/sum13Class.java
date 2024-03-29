public class sum13Class {

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
      
    
}
