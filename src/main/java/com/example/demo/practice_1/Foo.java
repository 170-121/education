package com.example.demo.practice_1;

public class Foo {

	public static void main(String[] args) {

		/**
		 * 이렇게 실행할 수 있음. 이것을 람다로 바꿔서 쓸수 있음. 시그니처가 같으니까
		 */
		DemoInterface demoInterface = new DemoInterface() {
			@Override
			public void getAge() {
				System.out.println("age");
			}
		};
		demoInterface.getAge();

		/**
		 * 람다 이용한 펑셔널 인터페이스
		 */
		DemoInterface demoInterface1 = () -> System.out.println("age2");
		demoInterface1.getAge();

		DemoInterface demoInterface2 = () -> {
			System.out.println("age3");
			System.out.println("age4");
		};
		demoInterface2.getAge();

		/**
		 * 순수 함수 : 만약 외부 변수로 + 10 이아닌 + number2 라면 순수함수가 아님
		 * 외부 환경에 지장이 가니까
		 */
		Demo2Interface demo2Interface = number -> number + 10;
		System.out.println(demo2Interface.getInt(3));
		demo2Interface.getInt(3);
	}
}
