/**
	����:
	��ʾ�⼸���������& | && || ! ^
*/
public class LogicalOperatorDemo
{
	public static void main(String[] args)
	{
		boolean money = true;
		boolean house = false;
		boolean car = true;

		//�������&   AND(��)
		boolean marry = money & house;
		System.out.println( marry );

		//�������|   OR(��)
		boolean happy = money | house;
		System.out.println( happy );

		//�������&&  AND(��·)
		boolean life = money && car && house;
		System.out.println( life );

		//�������||  OR(��·)
		boolean soWhat = money || house;
		System.out.println( soWhat );

		//�������!	  Not(��)
		boolean have = !money;
		System.out.println( have );

		//�������^    XOR (���)
		boolean that = money ^ car;
		System.out.println( that );
	}
}
/**
	С��:boolean ��������
	&&����&�����ͬ�����ж�·Ч��
	||: ��|�����ͬ�����ж�·Ч��

*/