/**
	����:
	switch���
	��ʾ��͸Ч��(��������Ϣ��)
*/
public class SwitchDemo3
{
	public static void main(String[] args)
	{
		int weekday = 5 ;
		switch (weekday)
		{
			case 1:
			case 2:	
			case 3:
			case 4:
			case 5:
				System.out.println("�ϰ�");
				break;
			case 6:
			case 7:
				System.out.println("�ż�");
				break;
			default:
				System.out.println("������");					
		}
	}
}
/**
	С��:
	ע�ⲻ��©дbreak
*/