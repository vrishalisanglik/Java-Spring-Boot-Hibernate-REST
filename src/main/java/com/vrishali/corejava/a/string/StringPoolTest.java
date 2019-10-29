package com.vrishali.corejava.a.string;

public class StringPoolTest {

	public static void main(String args[]) {
		String abc = new String("abc");
		String newabc = new String("abc");
		String abctest1 = "abc";
		String abctest2 = "Abc";
		System.out.println(abc.hashCode());
		System.out.println(newabc.hashCode());
		System.out.println(abctest1.hashCode());
		System.out.println(abctest2.hashCode());
	}
}
