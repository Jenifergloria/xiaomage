/**
	控制外层循环
*/
public class LoopInLoopControlDemo
{
	public static void main(String[] args)
	{
		outter:for (int i = 1 ; i <= 9 ; i++ )
		{
			for (int j = 1; j <= i ; j++ )
			{
				if (i == 5)
				{
					break outter;
				}
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
/**
小结：标签就是给某个循环起的别名，不过该别名得满足标识符的规范。
*/