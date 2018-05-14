package com.javaeasy.anonymousclass;

public abstract class AnAbstractClass {			// 抽象类
	public AnAbstractClass(int variable) {		// 抽象类中的构造方法
		System.out.println("Had use AnAbstractClass with num");
	}
	public AnAbstractClass() {					// 抽象类中的构造方法
		System.out.println("Had use AnAbstractClass with no_num");
	}
	public abstract void method();				// 抽象类中的抽象方法
}
