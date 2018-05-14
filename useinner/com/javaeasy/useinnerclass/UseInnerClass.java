package com.javaeasy.useinnerclass;

import com.javaeasy.innerclass.UseInnerClassOutside;		// 引入外部类
import com.javaeasy.innerclass.UseInnerClassOutside.InnerClass;	// （1）引入需要使用的内部类

public class UseInnerClass {								// 例程类
	public static void main(String[] args) {				// main()方法
		// 创建一个外部类的对象，因为创建内部类的对象需要这个对象
		UseInnerClassOutside out = new UseInnerClassOutside();
		// （2）创建InnerClass类的对象，并让InnerClass的引用inner指向这个对象
		InnerClass inner =out.new InnerClass();
		// 通过引用inner调用内部类InnerClass的方法
		System.out.println("内部类方法的返回值：" + inner.getVariable());

	//	UseInnerClassOutside a1 = new UseInnerClassOutside();
		InnerClass a2 = new UseInnerClassOutside().new InnerClass() ;
		System.out.println("aaa" + a2.getVariable());

	}
}
