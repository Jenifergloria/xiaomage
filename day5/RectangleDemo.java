/**
	打印矩形 2B NB
*/
public class RectangleDemo
{
	public static void main(String[] args)
	{
		//2B找规律
		//第一行
		for (int i = 0; i < 8 ; i++ )
		{
			System.out.print("*");
		}
		System.out.println();
		//第二行
		for (int i = 0; i < 8 ; i++ )
		{
			System.out.print("*");
		}
		System.out.println();
		//第三行
		for (int i = 0; i < 8 ; i++ )
		{
			System.out.print("*");
		}
		System.out.println();
		//第四行
		for (int i = 0; i < 8 ; i++ )
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.println("--------------");

		//for嵌套循环
		for (int i = 0; i < 4; i++ )
		{
			for (int j = 0;j < 8 ; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/**
	小结:
	print不会换行, println 会自动换行

*/