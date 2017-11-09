/**
	需求:
	演示这几个运算符：& | && || ! ^
*/
public class LogicalOperatorDemo
{
	public static void main(String[] args)
	{
		boolean money = true;
		boolean house = false;
		boolean car = true;

		//运算符：&   AND(与)
		boolean marry = money & house;
		System.out.println( marry );

		//运算符：|   OR(或)
		boolean happy = money | house;
		System.out.println( happy );

		//运算符：&&  AND(短路)
		boolean life = money && car && house;
		System.out.println( life );

		//运算符：||  OR(短路)
		boolean soWhat = money || house;
		System.out.println( soWhat );

		//运算符：!	  Not(非)
		boolean have = !money;
		System.out.println( have );

		//运算符：^    XOR (异或)
		boolean that = money ^ car;
		System.out.println( that );
	}
}
/**
	小结:boolean 数据类型
	&&：和&结果相同，具有短路效果
	||: 和|结果相同，具有短路效果

*/