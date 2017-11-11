/**
	do-while 循环
	打印一个字符串100次
	从1打印到100
	从1到100之间整数之和
*/
public class DoWhileDemo
{
	public static void main(String[] args)
	{
		//打印一个字符串100次
		int acount = 0;
		do
		{
			System.out.println("认真上课");
			acount ++;
		}
		while (acount < 100);
		//从1打印到100
		int num = 1;
		do
		{
			System.out.println( num );
			num ++;
		}
		while (num <= 100);
		//从1到100之间整数之和
		int result = 0;
		int num1 = 0;
		do
		{
			result += num1;
			num1 ++;
		}
		while ( num1 <= 100);
		System.out.println( result );
	}
}
/**
	小结:
	先执行一次循环体，再判断表达式，若为true就执行循环体，否则，跳过循环体。
    也就是说do while是先执行后判断，即使判断条件为false，该循环至少会执行一次。 
*/
