/**
   �žų˷� 2B NB
*/
public class Table99Demo
{
	public static void main(String[] args)
	{
		//�ҹ���
		int row = 1;//��һ�У������һ������
		for (int i = 1; i <= row; i ++)//i����ڶ�������
		{
			System.out.print(i + " * " + row + " = " + (row * i) + " \t ");
		}
		System.out.println();//����
		row ++;
		for (int i = 1; i <= row; i ++)//i����ڶ�������
		{
			System.out.print(i + " * " + row + " = " + (row * i) + " \t ");
		}
		System.out.println();//����
		row ++;
		for (int i = 1; i <= row; i ++)//i����ڶ�������
		{
			System.out.print(i + " * " + row + " = " + (row * i) + " \t ");
		}
		System.out.println();//����
		row ++;
		System.out.println("-------------------------------");
		//�žų˷�
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
	С��:
	�ַ���Ҫ˫����
*/