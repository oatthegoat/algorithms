import java.io.*;
public class TwoSum {

  public static void main (String cheese[]){
    int[] nums = { 2, 7, 11, 15 };
    System.out.println(twoSum(numbers, 9))
  } throws IOException {

  public int[] twoSum(int[] nums, int target) {
    int i, j, sum;
    int[] result = new int[2];
    for (i = 0; i < nums.length - 1; i++) {
      for (j = i + 1; j < nums.length; j++) {
        sum = nums[i] + nums[j];
        if (sum == target) {
          result[0] = i;
          result[1] = j;
          break;
        }
      }
    }
    return result;
  }
}
