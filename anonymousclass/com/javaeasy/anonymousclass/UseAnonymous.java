package com.javaeasy.anonymousclass;			// 包名
public class UseAnonymous {						// 例程类
	AnInterface intf = new AnInterface() {		// 创建一个抽象内部类对象，并让接口的引用指向该对象
		public void method() {					// 实现接口中定义的抽象方法
			System.out.println("this is interface");
		}
	};

	AnAbstractClass a = new AnAbstractClass(99) {
		@Override
		public void method() {
			System.out.println("this is abstract class");
		}
	};
}
