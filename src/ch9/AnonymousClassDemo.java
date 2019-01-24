package ch9;

public class AnonymousClassDemo {
	public static void main(String[] args) {
		Object obj = new Object() {
			public String toString() {
				return "匿名類別物件";
			}
		};
		
		System.out.println(obj);
	}
}
