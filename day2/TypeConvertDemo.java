/**
	需求:
	数据类型的转换和表达式自动提升
*/
public class TypeConvertDemo
{
	public static void main(String[] args)
	{
		//自动类型转换
		byte  b1 = 8;
		short s1 = b1;
		int   i1 = s1;
		long  l1 = i1;

		float  f1 = l1;
		double d1 = f1;
		System.out.println(d1);
		
		//强制类型转换
		float f2 = (float)d1;
		System.out.println(f2);

		//表达式自动提升
		double d2= 3.14 + 123 + 40F + 100L;
		System.out.println(d2);
	}
}
/**
	小结:
	当一个算术表达式中包含多个基本数据类型(boolean除外)的值时，
	整个算术表达式的数据类型将在数据运算时出现类型自动提升，其规则是：
    所有的byte、short、char类型被自动提升到int类型；
*/




