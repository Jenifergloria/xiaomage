/**
	return 终止方法
*/
public class ReturnDemo
{
	public static void main(String[] main)
	{
		for (int i = 10 ; i < 100 ; i ++ )
		{
			if (i ==50 )
			{
				System.out.println( i);
				return;
			}
		}
	}
}
/**
	表示结束循环所在的方法，方法都结束了，循环结构自然也就结束了。
*/