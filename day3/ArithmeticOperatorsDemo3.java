/**
	需求:
	算术运算符(++和--)面试题的程序代码

	20171109增加--运算 by jenifer

	@Author jenifer
	@Date 2017/11/9
*/
public class ArithmeticOperatorsDemo3
{
	public static void main(String[] args)
	{
		//算术运算符(++和--)程序代码
		int i = 5;
		i++;
		System.out.println("i=" + i);
		++i;
		System.out.println("i=" + i);
		System.out.println("---------");
		int a = ++i;
		System.out.println("a=" + a);
		System.out.println("i=" + i);
		int b = i++;
		System.out.println("b=" + b);
		System.out.println("i=" + i);

		int num1 = 1;
		num1 = num1++;
		System.out.println(num1);

		int num2 = 1;
		num2 = ++num2;
		System.out.println(num2);

	}
}
/**
	小结:
	"------"要加上双引号
	都只能操作变量,不能操作常量
*/