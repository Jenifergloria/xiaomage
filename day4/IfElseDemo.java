/**
	����:
	if-else���ṹ
	��ʾ��Ů��ϴ�ּ�
	��ʾ��ҳ��ȡ����ֵ����Сֵ(ע�⻹Ҫʹ����Ԫ������ķ�ʽ��ʾ)
*/
public class IfElseDemo
{
	public static void main(String[] args)
	{
		boolean isWoman = true;
		//�ж��Ƿ�Ϊtrue,true������Ůϴ�ּ�
		if (isWoman == true)
		{
			System.out.println("����Ů��,����Ůϴ�ּ�");
		}
		//false������ϴ�ּ�
		else
		{
			System.out.println("��������,������ϴ�ּ�");
		}
		//if-else ��ʾ��ҳ
		int totalLine = 198;
		int onePage = 10;
		if (totalLine % onePage == 0 )
		{
			System.out.println( "��if-else������"+ totalLine / onePage + "ҳ");
		}
		else
		{
			System.out.println( "��if-else������"+ totalLine / onePage + 1 + "ҳ" );
		}
		//��Ԫ������ķ�ʽ��ʾ��ҳ
		int totalPage = totalLine % onePage == 0 ? totalLine / onePage :totalLine / onePage + 1;
			System.out.println( "����Ŀ�����������"+ totalPage + "ҳ" );

		//if-else ��ʾȡ����ֵ����Сֵ
		int num1 = 19;
		int num2 = 12;
		if (num1 < num2)
		{
			System.out.println("��if-else�жϵ���Сֵ��" + num1);
		}
		else 
		{
			System.out.println("��if-else�жϵ���Сֵ��" + num2);
		}
		//��Ԫ������ķ�ʽ��ʾȡ����ֵ����Сֵ
		int minNumber = num1 < num2 ? num1 : num2;
		System.out.println("����Ŀ������жϵ���Сֵ��" + minNumber );
	}
}
/**
	С��:
	ע��if-else���涼Ҫ��һ��������
*/
