/**
	����:
	switch���
	��ʾ��ӡ���ڼ�
*/
public class SwitchDemo1
{
	public static void main(String[] args)
	{
		int weekday = 7;
		switch(weekday)
		{
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
			    break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("��������һ��");
		}
	}
}
/**
	С��:
	ע��:��Ҫ©дbreak, case 1�м�Ҫ�ո�, case�������ð��,default����ҲҪ��ð��

*/