/**
	����:
	�����м����������������ֵ
*/
public class SwapVarDemo
{
	public static void main(String[] args)
	{
		//�����м����������������ֵ
		int a = 14 ;
		double b= 3.15;
		System.out.println("����ǰa ��ֵ��" + a);
		System.out.println("����ǰb ��ֵ��" + b);
		int temp = a;
			a = (int)b;
			b = temp;
		System.out.println("������a ��ֵ��" + a);
		System.out.println("������b ��ֵ��" + b);
	}
}
/**
	С��:
	����һ���м����, ����������������ֵ
	��ͬ�������ͽ���,����ǿ��ת����ɵ����ݶ�ʧ
*/
