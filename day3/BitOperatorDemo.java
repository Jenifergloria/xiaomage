/**
	需求:
	演示这几个位运算符：& | ^ ~
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
	小结:
	"~"按位取反
*/