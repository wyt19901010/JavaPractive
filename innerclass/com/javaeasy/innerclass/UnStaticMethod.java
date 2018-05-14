package com.javaeasy.innerclass;					// 包名

public class UnStaticMethod {						// 外部类
	private int variableInClass = 2;				// 非静态成员变量
	private static int staticVariableInClass = 1;	// 静态成员变量
	public static void staticMethod() {
		final int variableInMethod = 3; 			// 方法中的局部变量，注意！使用final修饰的
		class InUnstaticMethod { 					// 局部内部类
			// 在类中可以使用staticVariableInClass和variableInMethod
		}
	}
	public void method() {							// 注意！非静态方法
		final int variableInMethod = 3;				// 方法中的局部变量，注意！使用final修饰的
		int v = 99;
		class InUnstaticMethod {					// 局部内部类
			public int variableInner = 4;			// 局部内部类中的成员变量
			public void innerMethod() {				// 局部内部类中的方法
				int innerMethodVariable = 5;
				System.out.println("内部类UnStaticMethod中innerMethod()方法里的局部变量：" + innerMethodVariable);		// （1）
				System.out.println("内部类InUnstaticMethod中的成员变量" + variableInner);						// （2）
				System.out.println("外部类中method()方法中的variableIn-Method变量" + variableInMethod);		// （3）
				System.out.println("外部类UnStaticMethod的对象中的成员变量variableInClass" + UnStaticMethod.this.variableInClass);	// （4）
				System.out.println("外部类UnStaticMethod的静态变量variableInClass" + UnStaticMethod. staticVariableInClass);															// （5）
				System.out.println(v);
			}
		}
		InUnstaticMethod a = new InUnstaticMethod();
		a.innerMethod();
	}
	static void method2() {
		final int aa = 9;
		 class Sc {
			int bb = aa;

			public void meht() {
				System.out.println(bb);
			}
		}
		Sc sc = new Sc();
		 sc.meht();
	}
}
