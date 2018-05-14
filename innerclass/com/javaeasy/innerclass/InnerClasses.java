package com.javaeasy.innerclass;			// 包名

public class InnerClasses {					// 外部类
	class Inner {							// 非静态内部类
		public int variable;				// 非静态内部类中的成员变量
	}

	static class StaticInner {				// 静态内部类
		public static int useInner() {		// 静态内部类中的静态方法
			InnerClasses out = new InnerClasses();	// 创建外部类的对象
			Inner inner = out.new Inner();			// 创建非静态内部类的对象
			return inner.variable;					// 通过inner引用访问非静态内部类对象的成员变量
		}
	}
}
