/**
	需求:
	利用中间变量交换两个变量值
*/
public class SwapVarDemo
{
	public static void main(String[] args)
	{
		//利用中间变量交换两个变量值
		int a = 14 ;
		double b= 3.15;
		System.out.println("交换前a 的值是" + a);
		System.out.println("交换前b 的值是" + b);
		int temp = a;
			a = (int)b;
			b = temp;
		System.out.println("交换后a 的值是" + a);
		System.out.println("交换后b 的值是" + b);
	}
}
/**
	小结:
	利用一个中间变量, 来交换两个变量的值
	不同数据类型交换,会有强制转换造成的数据丢失
*/
