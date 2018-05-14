package com.javaeasy.innerclass;	// 包名
public class DuplicatedName {		// 外部类DuplicatedName
	private int variable = 5;		// （1）外部类DuplicatedName的成员变量

	class InnerClass {		// 外部类DuplicatedName中的内部类InnerClass
		private int variable = 7;	// （2）内部类中的成员变量
		public int useOutVariable() {			// 内部类中的方法
			// （3） 通过“DuplicatedName.this”解决变量名冲突的问题
			return variable + DuplicatedName.this.variable;
		}
	}
}
