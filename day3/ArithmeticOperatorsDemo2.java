/**
	需求:
	前置++和后置++的问题
*/
public class ArithmeticOperatorsDemo2
{
	public static void main(String[] args)
	{
		//前置++
		int a = 5;
		int c = ++a;
		System.out.println("前置a:" + a + ",前置c:" + c);

		//后置++
		int b = 5;
		int d = b++;
		System.out.println("后置b:" + b + ",后置d:" + d);
	}
}
/**
	小结:
	前置++,变量自身先加,再赋值运算
    后置++,先赋值运算,再自加
*/