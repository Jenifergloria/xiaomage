/**
	����:
	���������:��������Ӽ��˳�����ģ���ӷ�����������������ı���
*/
public class ArithmeticOperatorsDemo
{
	public static void main(String[] args)
	{
		//�Ӽ��˳�����ģ
		int    a = 10;
		int    b = 3;
		double c =2.01;
		int    sum1 = a + b;
		double sum2 = a - b;
		int    sum3 = a * b;
		int    sum4 =(int)( b / c);
		int    sum5 = a % b;

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);

		//�ӷ����������
		//�ַ�'A'������ʱ,���Զ���Ϊint����������
		System.out.println(a / c + 'A' + "lucy");
		
		//�����ı���
		//System.out.println(a / 0;); ����������Ϊ0
		System.out.println(10/0.0);//���޴�
		System.out.println(-5/0.0);//����С
		System.out.println(0.0/0.0);//not a number
	}
}
/**
	С��:
	����������Ϊ��
	��ģȡ��������	
*/