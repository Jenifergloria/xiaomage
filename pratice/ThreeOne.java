public class ThreeOne

{
	//System.out.println���Զ�����,��������ǿ�ֵ,Ҳ���Լ�����,System.out.print���Զ�����
	public static void main(String[] args) 
	{
		int n = 7;

		for(int i=1;i<=n;i++){
		printOne(n-i);
		printTwo(2*i-1);
		printOne(n-i);
		System.out.println();
		}

		for(int i=1;i<=n-1;i++){
			printOne(i);
			printTwo(2*n-2*i-1);
			printOne(i);
			System.out.println();
		}

	}


	static void printOne(int n){
		for(int i=1;i<=n;i++){
			System.out.print(" ");
		}
	}

	static void printTwo(int n){
		for(int i=1;i<=n;i++){
			System.out.print("*");
		}
	}

}
