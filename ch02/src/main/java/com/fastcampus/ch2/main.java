package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class main {
	public static void main(String[] args) throws Exception{
//		Hello hello = new Hello();
//		hello.main(); // private�̱� ������ �ܺ� ȣ�� �Ұ�
		
		// Reflection API�� ��� - Ŭ���� ������ ��� �ٷ�� API
		// java.lang.reflect ��Ű������ ����
		// Hello Ŭ������ Class��ü�� ���´�.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance();
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); //privated�� main()�� ȣ�Ⱑ���ϰ� �Ѵ�.
		
		main.invoke(hello); // hello.main()
	}
}
