package com.example.demo.practice_1;


@FunctionalInterface // FunctionalInterface 을 써주면 두개 이상의 abstract 가 있으면 에러 내뱉음
public interface DemoInterface {

	/**
	 * 	Abstract는 디폴트 값으로 들어가있음
	 * 	만약 두개 이상의 구현되지않는 abstract 가 2개 이상이면 그건 함수형 인터페이스가 아님 즉슨
	 */
	void getAge();
	// abstract void getName();

	/**
	 * 이렇게 static 으로 쓰면 pulbic 은 default고
	 * 이래도 만약 abstract 가 1개면 이 또한 계속 함수형 인터페이스다. (default 접근제어자도 ok)
	 */

	static void printA() {
		System.out.println("demoA");
	}

	default void printB() {
		System.out.println("demoB");
	}
}
