package com.javaeasy.innerclass;			// 包名

public class ClassInMethod {				// ClassInMethod类
	public int variable;					// ClassInMethod类的成员变量
	public ClassInMethod() {				// ClassInMethod类的构造方法
		// 内部类InnerClassInConstructMethod的代码开始
		class InnerClassInConstructMethod {	// 构造方法中的内部类InnerClassInConstructMethod
			public int variable;			// InnerClassInConstructMethod内部类的变量

			public InnerClassInConstructMethod() {	// InnerClassInConstructMethod内部类的构造方法
			}
			public int getVariable() {		// InnerClassInConstructMethod内部类的方法
				return variable;
			}
		}
		// 内部类InnerClassInConstructMethod的代码结束
	}

	public int getVariable() {				// ClassInMethod类的方法
		// 内部类InnerClassInMethod的代码开始
		class InnerClassInMethod {	// 普通方法中的内部类InnerClassInMethod
			public int variable;	// 内部类InnerClassInMethod的变量

			public InnerClassInMethod() {	// 内部类InnerClassInMethod的构造方法
			}
			public int getVariable() {		// 内部类InnerClassInMethod中的方法
				return variable;
			}
		}
		// 内部类InnerClassInMethod的代码结束
		return variable;
	}
}
