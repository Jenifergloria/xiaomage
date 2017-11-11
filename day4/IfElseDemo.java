/**
	需求:
	if-else语句结构
	演示男女上洗手间
	演示分页和取两个值的最小值(注意还要使用三元运算符的方式演示)
*/
public class IfElseDemo
{
	public static void main(String[] args)
	{
		boolean isWoman = true;
		//判断是否为true,true就是上女洗手间
		if (isWoman == true)
		{
			System.out.println("你是女生,请上女洗手间");
		}
		//false就上男洗手间
		else
		{
			System.out.println("你是男生,请上男洗手间");
		}
		//if-else 演示分页
		int totalLine = 198;
		int onePage = 10;
		if (totalLine % onePage == 0 )
		{
			System.out.println( "用if-else共分了"+ totalLine / onePage + "页");
		}
		else
		{
			System.out.println( "用if-else共分了"+ totalLine / onePage + 1 + "页" );
		}
		//三元运算符的方式演示分页
		int totalPage = totalLine % onePage == 0 ? totalLine / onePage :totalLine / onePage + 1;
			System.out.println( "用三目运算符共分了"+ totalPage + "页" );

		//if-else 演示取两个值的最小值
		int num1 = 19;
		int num2 = 12;
		if (num1 < num2)
		{
			System.out.println("用if-else判断的最小值是" + num1);
		}
		else 
		{
			System.out.println("用if-else判断的最小值是" + num2);
		}
		//三元运算符的方式演示取两个值的最小值
		int minNumber = num1 < num2 ? num1 : num2;
		System.out.println("用三目运算符判断的最小值是" + minNumber );
	}
}
/**
	小结:
	注意if-else后面都要跟一个花括号
*/
