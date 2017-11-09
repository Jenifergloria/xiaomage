/**
	需求:
	三元运算符语法及其应用
	四舍五入
	最大值或最小指
	奇偶数
*/
public class TernaryOperatorDemo
{
	public static void main(String[] args)
	{
		//三元运算符语法及其应用
		int a= 5 > 3 ? 5 : 3;
		System.out.println(a);

		//四舍五入
		double weight = 120.49;
		int over = (int)weight;
		int save = weight - over >= 0.5 ? over + 1: over;
		System.out.println(save);

		//最大值或最小指
		int she = 20;
		double he= 18.23;
		double max = she > he ? she: he;
		System.out.println(max);

		//奇偶数
		int numb = 10;
		String ret = numb % 2 == 0 ? "偶数" : "奇数" ;
		System.out.println(ret);
	}
}
/**
	小结:
	">="之间不可以有空格
	三元运算符语法要熟悉
	三元运算符的等号"=="
*/

