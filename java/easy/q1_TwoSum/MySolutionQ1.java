
public static void main() {
  System.out.println("Hello world!");
  assert sum(10, 40) == 40 : "Test 1 failed";
  System.out.println("All tests passed!");
}

public static int sum(int num1, int num2) {
    return num1 + num2;
}

