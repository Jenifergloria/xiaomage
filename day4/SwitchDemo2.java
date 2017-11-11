/**
	需求:
	switch语句
	演示不支持 long 类型
*/
public class SwitchDemo2
{
	public static void main(String[] args)
	{
		long wrong = 89L;
		switch (wrong)
		{
			case 1:
				System.out.println("wrongOne");
				break;
			case 2:
				System.out.println("wrongTwo");
				break;
			case 3:
				System.out.println("wrongthree");
				break;
			default: 
				System.out.println("wrongfour");

		
		}
	}
}
/**
	小结:
	switch仅仅支持int类型(byte, short ,char 会自动提升为int类型)
*/