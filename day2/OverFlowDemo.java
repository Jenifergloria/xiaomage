/**
	需求:
	演示数据紊乱
*/
public class OverFlowDemo
{
	public static void main(String[] args)
	{
		//int类型的最大值
		int intMax = 2147483647;
		//让intMax变量的值加1之后,再赋给intMax变量
		intMax = intMax + 1;
		System.out.println("int的最大值:"+intMax);

		int intMin = -2147483647;
		intMin = intMin - 1;
		System.out.println("int的最小值:"+intMin);
	}
}
/**
	小结:
	溢出情况发生时程序并没有做数据范围检查处理，此时会出现数据紊乱情况
*/










