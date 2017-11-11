/**
	需求:
	switch语句
	演示打印星期几
*/
public class SwitchDemo1
{
	public static void main(String[] args)
	{
		int weekday = 7;
		switch(weekday)
		{
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
			    break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期天");
				break;
			default:
				System.out.println("不存在这一天");
		}
	}
}
/**
	小结:
	注意:不要漏写break, case 1中间要空格, case后面的是冒号,default后面也要有冒号

*/