/**
	需求:
	成绩案例
	考试分数等级(三个等级和多多努力)
*/
public class ScoreLevelDemo
{
	public static void main(String[] args)
	{
		//if-elseif-else
		int score = 100;
		if ( score >= 90)
		{
			System.out.println("你的成绩是优秀");
		}
		else if(90> score && score <= 80 )
		{
			System.out.println("你的成绩是优良" );
		}
		else if (80> score && score <= 70 )
		{
			System.out.println("你的成绩是一般" );
		}
		else 
		{
			System.out.println("你需要多多努力" );
		}
		
	}
}
/**
	小结:
	注意不要写错为数学的格式(80> score && score <=70 )
*/