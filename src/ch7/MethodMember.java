package ch7;

public class MethodMember {
	public static void main(String[] args) {
		MethodDemo methodDemo = new MethodDemo();
		
		methodDemo.scopedemo();
		System.out.println(methodDemo.getData());
		
		methodDemo.setData(100);
		System.out.println(methodDemo.getData());
	}
}

class MethodDemo{
	private int data = 10;
	
	public void scopedemo() {
		// int data = 100;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
}
