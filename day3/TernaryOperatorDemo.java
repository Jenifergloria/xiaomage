/**
	����:
	��Ԫ������﷨����Ӧ��
	��������
	���ֵ����Сָ
	��ż��
*/
public class TernaryOperatorDemo
{
	public static void main(String[] args)
	{
		//��Ԫ������﷨����Ӧ��
		int a= 5 > 3 ? 5 : 3;
		System.out.println(a);

		//��������
		double weight = 120.49;
		int over = (int)weight;
		int save = weight - over >= 0.5 ? over + 1: over;
		System.out.println(save);

		//���ֵ����Сָ
		int she = 20;
		double he= 18.23;
		double max = she > he ? she: he;
		System.out.println(max);

		//��ż��
		int numb = 10;
		String ret = numb % 2 == 0 ? "ż��" : "����" ;
		System.out.println(ret);
	}
}
/**
	С��:
	">="֮�䲻�����пո�
	��Ԫ������﷨Ҫ��Ϥ
	��Ԫ������ĵȺ�"=="
*/

