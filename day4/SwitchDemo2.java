/**
	����:
	switch���
	��ʾ��֧�� long ����
*/
public class SwitchDemo2
{
	public static void main(String[] args)
	{
		long wrong = 89L;
		switch (wrong)
		{
			case 1:
				System.out.println("wrongOne");
				break;
			case 2:
				System.out.println("wrongTwo");
				break;
			case 3:
				System.out.println("wrongthree");
				break;
			default: 
				System.out.println("wrongfour");

		
		}
	}
}
/**
	С��:
	switch����֧��int����(byte, short ,char ���Զ�����Ϊint����)
*/