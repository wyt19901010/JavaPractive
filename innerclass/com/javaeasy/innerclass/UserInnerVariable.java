package com.javaeasy.innerclass;		// 包名

public class UserInnerVariable {		// 外部类
	public class InnerClass {
		public int variable = 5;            // 内部类
		private int variable2 = 5;		// 内部类中的变量，是private修饰的
	}
	public int useVariableOfInner() {	// 外部类中的方法
		InnerClass inner = new InnerClass();	// 创建内部类实例
		return inner.variable;			// （1）访问内部类中的private变量
	}
}
