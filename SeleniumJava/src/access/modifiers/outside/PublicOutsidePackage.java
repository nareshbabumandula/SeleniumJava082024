package access.modifiers.outside;

import com.access.modifiers.PublicTest;

public class PublicOutsidePackage {

	public static void main(String[] args) {
		System.out.println("Accessing public constructor, variable and method from a different package..!");
		PublicTest pt = new PublicTest();
		System.out.println(pt.username);
		pt.m1();
	}

}
