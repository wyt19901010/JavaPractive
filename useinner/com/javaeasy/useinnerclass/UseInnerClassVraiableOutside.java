package com.javaeasy.useinnerclass;			// 包名

import com.javaeasy.innerclass.UserInnerVariable;// 引入使用的内部类和外部类
import com.javaeasy.innerclass.UserInnerVariable.InnerClass;

public class UseInnerClassVraiableOutside {	// 例程类
	public static void main(String[] args) {	// main()方法
		UserInnerVariable out = new UserInnerVariable();// 创建外部类UserInnerVariable的实例
		InnerClass inner = out.new InnerClass();// 创建内部类InnerClass的实例
		int a = inner.variable;					// （1）错误，在类的外部不能访问private修饰的变量
	}
}
