/**
	����:
	while ѭ��
	��ӡһ���ַ���100��
	��1��ӡ��100
	��1��100֮������֮��
*/
public class WhileDemo
{
	public static void main(String[] args)
	{
		//whileѭ����ӡһ���ַ���100��
		int acount = 0;
		while ( acount < 100 )
		{
			System.out.println("�ú�ѧϰJAVA");
			acount++;
		}
		//whileѭ����1��ӡ��100
		int num = 1;
		int acount1 = 0;
		while ( acount1 < 100 )
		{
			System.out.println( num );
			num += 1;
			acount1 ++;
		}
		//��1��100֮������֮��
		int num2 = 0;
		int result = 0;
		while ( num2 <= 100 )
		{
			result += num2;
			num2 ++;
		}
		System.out.println( result );

	}
}
/**
	С��:
	��Ҫ©дacount++,����������ѭ��
*/