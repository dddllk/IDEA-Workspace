package day06;
/*
	关于java语言当中的方法：
		1. 方法怎么定义，语法结构：
			[修饰符列表] 返回值类型 方法名(形式参数列表) {
				方法体;
				return 字面值;
			}
		2. 对以上的语法结构进行解释说明：
			2.1 关于修饰符列表
				* 可选项不是必须的，
				* 目前统一写成，public static 【】
				* 方法的修饰符列表当中有static关键字的话，怎么调用这个方法？
					- 类名.方法名(实际参数列表);
			2.2 返回值类型
				* 什么是返回值？
					一个方法是可以完成某个特定功能的，这个功能结束之后大多数都是需要
					返回最终执行结果的，执行结果可能是一个具体存在的数据，而这个具体
					存在的数据就是返回值
				* 返回值类型？
						返回值是一个具体存在的数据，数据都是有类型的，此处需要指定的是返回值的具体类型
				* 返回值类型都可以指定哪些类型？
						java任意一种类型都可以，包括基本数据类型和引用数据类型
				* 也可能这个方法执行结束之后不返回任何数据，java中规定，当一个方法执行结束之后，
					不返回任何数据的化，返回值类型位置必须编写：void关键字
				* 返回值得类型可以是：
					 byte,short,int,long,float,double,char,string,boolean,void...
				* 返回值类型若不是void，表示这个方法执行结束之后必须返回一个具体数值。
				  当方法执行结束的时候没有返回任何数据类型的话，编译器报错，怎么返回值呢
				  return 值;并且要求“值”的数据类型必须和“方法的返回值类型”一致，不然编译器报错。
				* 返回值类型是void的时候，在方法体当中不能编写“return 值;”这样的语句。
					但是要注意可以编写“return;”这样的语句
				* 只要带有return关键字的语句执行，return语句所在的方法结束。【不是jvm结束，是所在的方法结束。】
		2.3 方法名：
				* 只要是合法的标识符就行
				* 方法名最好见名知义
				* 方法名最好是动词
				* 方法名首字母小写，后面首字母大写。
		2.4 形式参数列表，简称形参
				* 形参是局部变量，int a; double b; float c;String s;...
				* 形参的个数可以是0-N个
				* 多个形参之间用“,”隔开
				* 形参中起决定作用的是形参的数据类型，形参的名字就是局部变量的名字。
				* 方法在调用的时候，实际给这个方法传递的真实数据被称为：实际参数，简称实参。
				* 实参列表和形参列表必须满足：
					- 数量相同
					- 类型对应相同
					例如：
						方法定义：
							public static int sum(int 变量名，int 合法的标识符就行) {
								int a;
								int b;
							}
						方法调用：
							sum("abc", "def");编译器报错
							sum(10, 20); // (10, 20)是实参列表

		2.5 方法体当中的代码由大括号括起来，方法体当中的代码有顺序，遵循自上而下依次执行。
				并且方法由java语句构成，每个java语句以“;”结尾。
	3. 方法怎么调用？
			方法之定义不去调用的时，是不会执行的，只有在调用的时候才会执行。
 */
public class MethodTest03 { // 汽车工厂
	public static void main(String[] args) {
		// 调用这个方法
	}
	// 定义一个方法
	// 一个车间
	public static int sumInt(int a, int b) {
		int c = a + b;
		return c;
	}

}
