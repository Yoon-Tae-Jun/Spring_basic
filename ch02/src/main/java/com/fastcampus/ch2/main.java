package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class main {
	public static void main(String[] args) throws Exception{
//		Hello hello = new Hello();
//		hello.main(); // private이기 때문에 외부 호출 불가
		
		// Reflection API를 사용 - 클래스 정보를 얻고 다루는 API
		// java.lang.reflect 패키지에서 제공
		// Hello 클래스의 Class객체를 얻어온다.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance();
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); //privated인 main()을 호출가능하게 한다.
		
		main.invoke(hello); // hello.main()
	}
}
