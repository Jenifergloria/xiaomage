/**
	do-while ѭ��
	��ӡһ���ַ���100��
	��1��ӡ��100
	��1��100֮������֮��
*/
public class DoWhileDemo
{
	public static void main(String[] args)
	{
		//��ӡһ���ַ���100��
		int acount = 0;
		do
		{
			System.out.println("�����Ͽ�");
			acount ++;
		}
		while (acount < 100);
		//��1��ӡ��100
		int num = 1;
		do
		{
			System.out.println( num );
			num ++;
		}
		while (num <= 100);
		//��1��100֮������֮��
		int result = 0;
		int num1 = 0;
		do
		{
			result += num1;
			num1 ++;
		}
		while ( num1 <= 100);
		System.out.println( result );
	}
}
/**
	С��:
	��ִ��һ��ѭ���壬���жϱ��ʽ����Ϊtrue��ִ��ѭ���壬��������ѭ���塣
    Ҳ����˵do while����ִ�к��жϣ���ʹ�ж�����Ϊfalse����ѭ�����ٻ�ִ��һ�Ρ� 
*/
