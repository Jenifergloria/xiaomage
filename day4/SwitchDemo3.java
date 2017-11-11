/**
	需求:
	switch语句
	演示穿透效果(工作日休息日)
*/
public class SwitchDemo3
{
	public static void main(String[] args)
	{
		int weekday = 5 ;
		switch (weekday)
		{
			case 1:
			case 2:	
			case 3:
			case 4:
			case 5:
				System.out.println("上班");
				break;
			case 6:
			case 7:
				System.out.println("放假");
				break;
			default:
				System.out.println("不存在");					
		}
	}
}
/**
	小结:
	注意不可漏写break
*/