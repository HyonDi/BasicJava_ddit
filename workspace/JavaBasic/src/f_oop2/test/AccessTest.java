package f_oop2.test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
	/*	System.out.println(am.protectedVar);
		am.protectedMethod();*/ //요로케 접근가능한건 아님. 상속을 받으면 내거야. 내파일의 클래스처럼 접근해야함.
		AccessTest at = new AccessTest();		
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
		
		/*
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
*/		
	}

}
