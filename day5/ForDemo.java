/**
	500��˧������ӡ1��100������100���ڵ��������ͣ�for ѭ������ ��ѭ��������ѭ����
*/
public class ForDemo
{
	public static void main(String[] args)
	{
		//��ӡ500��˧��
		for (int i = 0;i < 500 ; i++ )
		{
			System.out.println("˧��,���˧!");
		}
		//��ӡ1��100
		for (int j = 1 ; j <= 100 ; j++ )
		{
			System.out.println( j );
		}
		//����100���ڵ�������
		int  result= 0;
		for (int k = 0; k < 100 ; k++)
		{
			result += k;
		}
		System.out.println( result );
		//��ѭ��������ѭ����
		//while��ѭ��
		while (true)
		{
			System.out.println( "while��ѭ��");
		}
		//do-while��ѭ��
		/**do
		{
			System.out.println( "do-while��ѭ��");
		}
		while (true);
		//for��ѭ��
		for (; ; )
		{
			System.out.println( "for��ѭ��");
		}*/		
	}	
}
/**
	С��:
	֪��ѭ���Ĵ���,���ȿ���forѭ��

*/