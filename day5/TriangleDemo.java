/**
	输出三角形图案  2B NB
*/
public class TriangleDemo
{
	public static void main(String[] main)
	{
		//输出三角形图案
		//找规律
		for (int i = 0; i < 1 ; i++ )
		{
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 3 ; i++ )
		{
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 5 ; i++ )
		{
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 7 ; i++ )
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.println("-----------");
		//声明一个变量,方便修改
		int row = 8;
		for (int i = 0; i < row ; i ++)
		{
			for (int j = 0; j < 2*i-1 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/**
	小结:
	先找规律
	记得打印一行空行
*/