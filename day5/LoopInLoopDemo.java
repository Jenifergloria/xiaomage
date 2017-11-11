/**
	嵌套循环（师徒4人人数数1到100数）
*/
public class LoopInLoopDemo
{
	public static void main(String[] args)
	{
		for (int i = 0 ; i < 4 ;i++ )
		{
			for (int j = 1; j <= 100 ;j++ )
			{				
				System.out.println( j );
			}
		}
	}
}
/**
	小结:
	for的嵌套循环,不能有相同的声明
*/