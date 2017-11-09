/**
	需求
	比较运算符：
	注意等于号与赋值符号的区别
	不等于、大于、小于、大于或等于、小于或等于等等	
*/
public class ComparisonOperatorDemo
{
	public static void main(String[] args)
	{
		//等于号与赋值符号的区别,"="赋值符,"=="等于号
		boolean a = 5 == 5;
		System.out.println(a);
		int b = 10;
		double c = 3.14;
		System.out.println(b != c);
		System.out.println(b > c);
		System.out.println(b < c);
		System.out.println(b >= c);
		System.out.println(b <= c);
	}
}
/**
	小结:
	"="表示赋值 
	"=="表示是否相等
*/




