// package java_problems.easy.q1_TwoSum;


public static void main() {
  System.out.println("---------------------------------------");
  System.out.println("---------------------------------------");

  System.out.println("Q1 Two Sums");
  test1();
  System.out.println("All tests passed!");

  System.out.println("---------------------------------------");
  System.out.println("---------------------------------------");

}

public static int[] twoSum(int[] nums, int target) {
 return nums;
}







// ------------------------------
public static void test1() {
  int[] nums = {2,7,11,15};
  int target = 9;
  int[] answer = {0,1};
  test(nums, target, answer, 1);
}


public static void test(int[] nums, int target, int[] answer, int testNo) {
  String numsToString = Arrays.toString(nums);
  String answerToString =Arrays.toString(answer);

  int[] actual = twoSum(nums, target);
  String actualToString =Arrays.toString(actual);
    
  System.out.println("---------------------------------------");
  System.out.println("nums: "+numsToString);
  System.out.println("target: "+target);
  System.out.println("Expecting: "+answerToString);
  System.out.println("Actual: "+actualToString);
  System.out.println("---------------------------------------");

  assert Arrays.equals(actual, answer) : String.format("Test %d failed", testNo);
}

