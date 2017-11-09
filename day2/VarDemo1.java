/**
需求:
	声明两个变量:一个成员变量,一个局部变量
	并初始化
*/
public class VarDemo1
{
	//定义成员变量,并初始化
	static int age=18;
	
	public static void main(String[] args)
	{
		//定义一个局部变量,并初始化
		String name="小明";
		System.out.println(name);
		System.out.println(age);
	}	
}
/**
小结:
	 要在主方法里面输出
	 字符串要双引号
*/