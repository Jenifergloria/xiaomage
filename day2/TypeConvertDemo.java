/**
	����:
	�������͵�ת���ͱ��ʽ�Զ�����
*/
public class TypeConvertDemo
{
	public static void main(String[] args)
	{
		//�Զ�����ת��
		byte  b1 = 8;
		short s1 = b1;
		int   i1 = s1;
		long  l1 = i1;

		float  f1 = l1;
		double d1 = f1;
		System.out.println(d1);
		
		//ǿ������ת��
		float f2 = (float)d1;
		System.out.println(f2);

		//���ʽ�Զ�����
		double d2= 3.14 + 123 + 40F + 100L;
		System.out.println(d2);
	}
}
/**
	С��:
	��һ���������ʽ�а������������������(boolean����)��ֵʱ��
	�����������ʽ���������ͽ�����������ʱ���������Զ�������������ǣ�
    ���е�byte��short��char���ͱ��Զ�������int���ͣ�
*/




