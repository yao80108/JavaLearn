package ch12;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericFooDemo {
	public static void main(String[] args) {
		GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
		GenericFoo<Integer> foo2 = new GenericFoo<Integer>();

		foo1.setFoo(new Boolean(true));
		Boolean b = foo1.getFoo();
		System.out.println(b);

		foo2.setFoo(new Integer(10));
		Integer i = foo2.getFoo();
		System.out.println(i);

		IntegerFoo integerFoo = new IntegerFoo();
		integerFoo.setFoo(100);
		System.out.println(integerFoo.getFoo());

		ObjectFoo objectFoo = new ObjectFoo();
		objectFoo.setFoo(new Integer(-20));
		String s = objectFoo.getFoo().toString();
		System.out.println(s);

		GenericFoo2<String, Integer> foo2_1 = new GenericFoo2<String, Integer>();
		foo2_1.setFoo1(new String("Hello"));
		foo2_1.setFoo2(new Integer(100));
		System.out.printf("%s %d%n", foo2_1.getFoo1(), foo2_1.getFoo2());

		String[] strings = { "Hello", "World", "!!!" };
		GenericFoo3<String> foo3_1 = new GenericFoo3<String>();
		foo3_1.setFooArray(strings);
		for (String string : strings)
			System.out.println(string);
		for (String string : foo3_1.getFooArray())
			System.out.println(string);

		WrapperFoo<Integer> wrapperFoo = new WrapperFoo<Integer>();
		wrapperFoo.setFoo(foo2);
		System.out.println(wrapperFoo.getFoo().toString());
		
		@SuppressWarnings("rawtypes")
		ListGenericFoo<LinkedList> listGenericFoo1 = new ListGenericFoo<LinkedList>();
		@SuppressWarnings("rawtypes")
		ListGenericFoo<ArrayList> listGenericFoo2 = new ListGenericFoo<ArrayList>();
		
		System.out.println(listGenericFoo1.getFooArray());
		System.out.println(listGenericFoo2.getFooArray());
	}
}
