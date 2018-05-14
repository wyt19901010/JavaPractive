package com.javaeasy.innerclass;		// 包名

public class OutClass {					// 类名
	private int varibale = 9;			// OutClass类中声明的一个变量

	public OutClass() {					// OutClass类的构造方法
	}
	public int getVaribale() {			// OutClass类中声明的一个方法
		return varibale;
	}
	// 以下为内部类的代码
	public class InnerClass {			// （1）类中声明的另一个类，也就是内部类
		// 内部类中可以包含任何符合Java语法格式的元素：
		public InnerClass() {			// 内部类InnerClass的构造方法
		}
		private int innerVariable;		// 内部类InnerClass中声明的变量

		public int getInnerVariable() {	// 内部类InnerClass中的方法
			return innerVariable;
		}
	}
	// 内部类的代码结束
}
//（2）注意，OutClass的代码到这里才结束，所以InnerClass是包含在OutClass之内的
