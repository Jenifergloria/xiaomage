/**
	����:
	��ʾ�⼸��λ�������& | ^ ~
*/
public class BitOperatorDemo
{
	public static void main(String[] args)
	{
		System.out.println(3&4);//0
		/*
			0000_0011
		&	0000_0100
		------------------
			0000_0000        
		*/
		System.out.println(3 | 4);
		System.out.println(3 ^ 4);
		System.out.println(~4);
	}		
}
/**
	С��:
	"~"��λȡ��
*/