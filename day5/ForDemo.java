/**
	500声帅锅、打印1到100、计算100以内的正整数和（for 循环）和 死循环（三种循环）
*/
public class ForDemo
{
	public static void main(String[] args)
	{
		//打印500声帅锅
		for (int i = 0;i < 500 ; i++ )
		{
			System.out.println("帅锅,你好帅!");
		}
		//打印1到100
		for (int j = 1 ; j <= 100 ; j++ )
		{
			System.out.println( j );
		}
		//计算100以内的正整数
		int  result= 0;
		for (int k = 0; k < 100 ; k++)
		{
			result += k;
		}
		System.out.println( result );
		//死循环（三种循环）
		//while死循环
		while (true)
		{
			System.out.println( "while死循环");
		}
		//do-while死循环
		/**do
		{
			System.out.println( "do-while死循环");
		}
		while (true);
		//for死循环
		for (; ; )
		{
			System.out.println( "for死循环");
		}*/		
	}	
}
/**
	小结:
	知道循环的次数,优先考虑for循环

*/