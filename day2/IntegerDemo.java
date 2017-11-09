/**
	需求:
	整数类型的使用 byte short int long
*/
public class IntegerDemo
{
	public static void main(String[] main)
	{
		//定义一个byte整数类型变量,并初始化
		byte age=17;
		//定义一个short 整数类型变量,并初始化
		short height=130;
		//定义一个int整数类型变量,并初始化
		int weight=50;
		//定义一个long整数类型变量,并初始化
		long num=900;

		System.out.println(age);
		System.out.println(height);                          
		System.out.println(weight);
		System.out.println(num);

		long num2=age*height-weight+100;
		System.out.println(num2);
	}
}
/**
	小结
	整型常量默认是int型
	
*/

