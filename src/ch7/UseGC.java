package ch7;

public class UseGC {
	public static void main(String[] args) {
		GcTest obj1 = new GcTest("obj1");
		GcTest obj2 = new GcTest("obj2");
		GcTest obj3 = new GcTest("obj3");
		
		obj1=null;
		obj2=null;
		obj3=null;
		
		System.gc();
	}
}
