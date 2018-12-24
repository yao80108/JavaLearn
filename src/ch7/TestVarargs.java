package ch7;

public class TestVarargs {
	public static void main(String[] args) {
		int sum = 0;

		sum = MathTool.sum(1, 2);
		System.out.println(sum);

		sum = MathTool.sum(1, 2, 3);
		System.out.println(sum);
		
		sum = MathTool.sum(1, 2, 156, 16, 156);
		System.out.println(sum);
	}
}
