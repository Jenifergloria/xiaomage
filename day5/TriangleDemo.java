/**
	���������ͼ��  2B NB
*/
public class TriangleDemo
{
	public static void main(String[] main)
	{
		//���������ͼ��
		//�ҹ���
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
		//����һ������,�����޸�
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
	С��:
	���ҹ���
	�ǵô�ӡһ�п���
*/