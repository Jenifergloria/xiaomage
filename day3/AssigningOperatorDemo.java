/*
	需求:
	赋值运算符语法及其应用 += -=
*/
public class AssigningOperatorDemo
{
	public static void main(String[] args)
	{
		//赋值运算符+=
		int b=10;
		    b += 5; //等于表达式: b = b + 5;
		System.out.println("b的值" + b);
		
		//赋值运算符-=
		int c = 20;
			c -= 5; //等于表达式 :c = c - 5;
		System.out.println("c的值" + c);
	}
}
/*
	小结:
	先声明,再赋值运算
	"+="这些符号中间不能有空格
*/