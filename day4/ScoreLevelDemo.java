/**
	����:
	�ɼ�����
	���Է����ȼ�(�����ȼ��Ͷ��Ŭ��)
*/
public class ScoreLevelDemo
{
	public static void main(String[] args)
	{
		//if-elseif-else
		int score = 100;
		if ( score >= 90)
		{
			System.out.println("��ĳɼ�������");
		}
		else if(90> score && score <= 80 )
		{
			System.out.println("��ĳɼ�������" );
		}
		else if (80> score && score <= 70 )
		{
			System.out.println("��ĳɼ���һ��" );
		}
		else 
		{
			System.out.println("����Ҫ���Ŭ��" );
		}
		
	}
}
/**
	С��:
	ע�ⲻҪд��Ϊ��ѧ�ĸ�ʽ(80> score && score <=70 )
*/