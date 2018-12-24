package ch7;

public class MathTool {
	public static int sum(int... nums) {
		int sum = 0;
		for (int num : nums)
			sum += num;
		return sum;
	}
}
