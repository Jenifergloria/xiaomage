/**
	����:
	��ʾ��������
*/
public class OverFlowDemo
{
	public static void main(String[] args)
	{
		//int���͵����ֵ
		int intMax = 2147483647;
		//��intMax������ֵ��1֮��,�ٸ���intMax����
		intMax = intMax + 1;
		System.out.println("int�����ֵ:"+intMax);

		int intMin = -2147483647;
		intMin = intMin - 1;
		System.out.println("int����Сֵ:"+intMin);
	}
}
/**
	С��:
	����������ʱ����û�������ݷ�Χ��鴦����ʱ����������������
*/










