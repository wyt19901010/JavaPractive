package com.javaeasy.innerclass;

public class UseInnerClassOutside {			// 外部类
	private int variable = 6;					// 成员变量
	public int getVariable() {					// 外部类中的方法
		return variable;
	}

	public class InnerClass {					// 内部类InnerClass
		private int variable = 5;				// 内部类中的变量
		public int getVariable() {				// 内部类中的方法
			return variable;
		}
	}

	public static class StaticInnerClass {		// 静态内部类
		private int variable = 5;				// 静态内部类的变量
		public int getVariable() {				// 静态内部类的方法
			return variable;
		}
	}
}
