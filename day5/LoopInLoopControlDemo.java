/**
	�������ѭ��
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
С�᣺��ǩ���Ǹ�ĳ��ѭ����ı����������ñ����������ʶ���Ĺ淶��
*/