/**
	����:
	���������(++��--)������ĳ������

	20171109����--���� by jenifer

	@Author jenifer
	@Date 2017/11/9
*/
public class ArithmeticOperatorsDemo3
{
	public static void main(String[] args)
	{
		//���������(++��--)�������
		int i = 5;
		i++;
		System.out.println("i=" + i);
		++i;
		System.out.println("i=" + i);
		System.out.println("---------");
		int a = ++i;
		System.out.println("a=" + a);
		System.out.println("i=" + i);
		int b = i++;
		System.out.println("b=" + b);
		System.out.println("i=" + i);

		int num1 = 1;
		num1 = num1++;
		System.out.println(num1);

		int num2 = 1;
		num2 = ++num2;
		System.out.println(num2);

	}
}
/**
	С��:
	"------"Ҫ����˫����
	��ֻ�ܲ�������,���ܲ�������
*/