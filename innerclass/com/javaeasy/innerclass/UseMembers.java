package com.javaeasy.innerclass;				// 包名

public class UseMembers {						// 外部类
	private int variableInOutClass = 5;		// 外部类中的private变量

	public class InnerVaribaleClass {			// 内部类

		private int variableInInnerClass = 10;		// 内部类中的private变量
		public int useOutVariable() {			// 内部类中的方法
			// 在内部类中使用外部类中的private变量variableInOutClass
			return variableInInnerClass + variableInOutClass;
		}
	}

	public void useInnerClassInstance() {		// 在方法中使用内部类
		InnerVaribaleClass inner = new InnerVaribaleClass();//（1）创建内部类对象
		inner.useOutVariable();					//（2）调用内部类方法
		// （3）在外部类中，可以访问内部类里private变量
		System.out.println("内部类中的private变量：" + inner.variableInInnerClass);
	}

	public static void getStaticNum() {
		System.out.println(5);
	}
}
