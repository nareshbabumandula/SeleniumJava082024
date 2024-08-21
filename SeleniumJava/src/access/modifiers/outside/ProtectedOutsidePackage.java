package access.modifiers.outside;

import com.access.modifiers.ProtectedTest;

public class ProtectedOutsidePackage extends ProtectedTest{

	public static void main(String[] args) {
		//ProtectedTest pt = new ProtectedTest();
		//System.out.println(pt.username);
		//pt.m1();
				
		ProtectedOutsidePackage pop = new ProtectedOutsidePackage();
		System.out.println(pop.username);
		pop.m1();
		
	}

}
