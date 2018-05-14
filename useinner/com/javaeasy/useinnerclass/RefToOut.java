package com.javaeasy.useinnerclass;				// 包名


import com.javaeasy.innerclass.UseMembers;
//import com.javaeasy.innerclass.UseMembers.InnerVaribaleClass;

public class RefToOut {								// 例程类
	public static void main(String[] args) {		// main()方法
		UseMembers out = new UseMembers();			// （1）创建外部类对象
		// （2）使用out引用创建一个内部类对象
		UseMembers.InnerVaribaleClass inner = out.new InnerVaribaleClass();
		// （3）通过inner调用useOutVariable()方法
		System.out.println("内部类方法的返回值：" + inner.useOutVariable());
        out.useInnerClassInstance();
        UseMembers.getStaticNum();
	}
}
