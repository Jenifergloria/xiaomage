/**
   九九乘法 2B NB
*/
public class Table99Demo
{
	public static void main(String[] args)
	{
		//找规律
		int row = 1;//第一行，代表第一个乘数
		for (int i = 1; i <= row; i ++)//i代表第二个乘数
		{
			System.out.print(i + " * " + row + " = " + (row * i) + " \t ");
		}
		System.out.println();//换行
		row ++;
		for (int i = 1; i <= row; i ++)//i代表第二个乘数
		{
			System.out.print(i + " * " + row + " = " + (row * i) + " \t ");
		}
		System.out.println();//换行
		row ++;
		for (int i = 1; i <= row; i ++)//i代表第二个乘数
		{
			System.out.print(i + " * " + row + " = " + (row * i) + " \t ");
		}
		System.out.println();//换行
		row ++;
		System.out.println("-------------------------------");
		//九九乘法
		for (int i = 1 ; i <= 9 ; i++ )
		{
			for (int j = 1; j <= i ;j++ )
			{
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------");
		for (int i = 1 ; i <= 9 ; i++ )
		{
			for (int j = 9; j >= i ;j-- )
			{
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
/**
	小结:
	字符串要双引号
*/