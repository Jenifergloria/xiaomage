/**
	需求:
	if-elseif-else语句结构
	演示打印星期几
*/
public class IfElseIfElseDemo
{
	public static void main(String[] args)
	{
		int weekday = 8;
		if (weekday ==1)
		{
			System.out.println("星期一");
		}else if (weekday == 2)
		{
			System.out.println("星期二");
		
		}else if (weekday == 3)
		{
			System.out.println("星期三");
		}else if (weekday == 4)
		{
			System.out.println("星期四");
		}else if (weekday == 5)
		{
			System.out.println("星期五");
		}else if (weekday == 6)
		{
			System.out.println("星期六");
		}else if (weekday == 7)
		{
			System.out.println("星期天");
		}else
		{
			System.out.println("不存在这一天");
		}
	}
}
/**
	小结:
	注意花括号,可以把花括号放在else前面,可以防止漏打
*/