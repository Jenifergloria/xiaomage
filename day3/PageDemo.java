/**
	����:
	��Ԫ������ڷ�ҳҵ���߼��е�ʹ��
	�ٶ�������ÿҳ������
	�ܵ�ҳ������һҳ����һҳ
*/
public class PageDemo
{
	public static void main(String[] args)
	{
		//��Ԫ������ڷ�ҳҵ���߼��е�ʹ��
		int totalCount = 399;
		int pageSize = 10;
		//��ҳ��
		int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1 ;
		System.out.println(totalPage);	
		//��һҳ
		int currentPage = 105;
		int page = currentPage - 1 >= 1?   currentPage - 1 : currentPage ;
		System.out.println(page);
		//��һҳ
		int page2 = currentPage + 1 <= 200?   currentPage + 1 : currentPage ;
		System.out.println(page2);
	}
}
/**
	С��:
	ע����Ԫ���������������
*/