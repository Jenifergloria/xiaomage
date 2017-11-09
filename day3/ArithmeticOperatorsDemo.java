/**
	需求:
	算术运算符:用来处理加减乘除和求模，加法的特殊情况，除法的报错
*/
public class ArithmeticOperatorsDemo
{
	public static void main(String[] args)
	{
		//加减乘除和求模
		int    a = 10;
		int    b = 3;
		double c =2.01;
		int    sum1 = a + b;
		double sum2 = a - b;
		int    sum3 = a * b;
		int    sum4 =(int)( b / c);
		int    sum5 = a % b;

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);

		//加法的特殊情况
		//字符'A'在运算时,会自动升为int整数来运算
		System.out.println(a / c + 'A' + "lucy");
		
		//除法的报错
		//System.out.println(a / 0;); 除数不可以为0
		System.out.println(10/0.0);//无限大
		System.out.println(-5/0.0);//无限小
		System.out.println(0.0/0.0);//not a number
	}
}
/**
	小结:
	除数不可以为零
	求模取得是余数	
*/