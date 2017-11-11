/**
	需求:
	while 循环
	打印一个字符串100次
	从1打印到100
	从1到100之间整数之和
*/
public class WhileDemo
{
	public static void main(String[] args)
	{
		//while循环打印一个字符串100次
		int acount = 0;
		while ( acount < 100 )
		{
			System.out.println("好好学习JAVA");
			acount++;
		}
		//while循环从1打印到100
		int num = 1;
		int acount1 = 0;
		while ( acount1 < 100 )
		{
			System.out.println( num );
			num += 1;
			acount1 ++;
		}
		//从1到100之间整数之和
		int num2 = 0;
		int result = 0;
		while ( num2 <= 100 )
		{
			result += num2;
			num2 ++;
		}
		System.out.println( result );

	}
}
/**
	小结:
	不要漏写acount++,否则会进入死循环
*/