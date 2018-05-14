package com.javaeasy.useinnerclass;				// 包名
import com.javaeasy.innerclass.UseInnerClassOutside.StaticInnerClass;														// （1）引入静态内部类
public class UseStaticInnerClass {					// 例程类
	public static void main(String[] args){ 		// main()方法
		// （2）创建静态内部类StaticInnerClass的对象，并让inner指向这个对象
		StaticInnerClass inner = new StaticInnerClass();
		// 通过inner引用调用StaticInnerClass中的getVariable()方法
		System.out.println("内部类方法的返回值：" + inner.getVariable());
	}
}
