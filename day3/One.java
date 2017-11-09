//定义一个 int 变量存放一个三位数的正数，分别求出百位数上的值、十位数上的值和个位数上的值。
public class One
{
	public static void main(String[] args)
	{
		int a= 234;
		int num1 = a/100;
		int num2 =( a - num1*100 ) /10;
		int num3 = a%10;
		System.out.println("百位数是:" + num1);
		System.out.println("十位数是:" + num2);
		System.out.println("个位数是:" + num3);
		double  d = 3.15 + 5.6F + 100 + 99L;
		System.out.println(d);
	}s
}






