/**
	需求:
	三元运算符在翻页业务逻辑中的使用
	假定条数和每页的条数
	总的页数，上一页，下一页
*/
public class PageDemo
{
	public static void main(String[] args)
	{
		//三元运算符在翻页业务逻辑中的使用
		int totalCount = 399;
		int pageSize = 10;
		//总页数
		int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1 ;
		System.out.println(totalPage);	
		//上一页
		int currentPage = 105;
		int page = currentPage - 1 >= 1?   currentPage - 1 : currentPage ;
		System.out.println(page);
		//下一页
		int page2 = currentPage + 1 <= 200?   currentPage + 1 : currentPage ;
		System.out.println(page2);
	}
}
/**
	小结:
	注意三元运算符的数据类型
*/