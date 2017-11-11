/**
	continue 跳过循环
*/
public class ContinueDemo
{
	public static void main(String[] args)
	{
		//输出1-10的整数,但不用输出5
		for (int i = 1 ; i <= 10; i++ )
		{
			if ( i == 5)
			{
				continue;
			}
			System.out.println("i: " + i);

		}
	}
}
/**
	小结:
	跳过当前的循环,进入下一次循环操作.
*/