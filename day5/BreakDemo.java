/**
	break 终止循环
*/
public class BreakDemo
{
	public static void main(String[] args)
	{
		//break 终止循环
		for (int i = 1; i < 100 ; i++)
		{
			if (i == 8)
			{
				break;
			}
			System.out.println(i);
		}
	}
}
/**
	小结:
	break 后面不能跟语句,因为永远不会执行,会编译报错
	break是关键字
*/