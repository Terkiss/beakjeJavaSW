package exam;
import java.util.Scanner;

public class Program {
	
	
	
	public static void main(String args[])
	{
		/*
		int mathMetic = 0, english = 0, korean = 0;
		Scanner sc = new Scanner(System.in);
		print("국어 점수를 입력 해주세요 : ");
		korean = sc.nextInt();
		print("수학 점수를 입력 해주세요 : ");
		mathMetic = sc.nextInt();
		
		print("영어 점수를 입력 해주세요 : ");
		english = sc.nextInt();
		
		if(evalution(korean, mathMetic, english)&& (evalution(korean)&&evalution(english)&&evalution(mathMetic) ) )
		{
			print("합격 입니다");
		}
		else
		{
			print("불 합 격 입니다");
		}
		
		*/

		/*
		String selector  ; 
		Scanner sc = new Scanner(System.in);
		int dan =9;
		print("선택 하십쇼 포문 : 포문,for,f \n화일문: 화일,while,w");
		selector = sc.next();
		if(selector.equals("포문")  ||selector.equals("for")||selector.equals("f"))
		print("출력 하고 싶은 단을 입력 하세오 ");
		dan = sc.nextInt();
		print("포문 \n");
		forMethodsGugudan(dan);
		print("와일문 \n");
		whileMethodsGugudan(dan);
		*/
		
		
	}
	public static void forMethodsGugudan(int dan)
	{
		for(int i = 1; i < 10; i++)
		{
			print("%d x %d = %d \n", dan, i, dan*i);
		}
	}
	public static void whileMethodsGugudan(int dan)
	{
		int i = 1;
		while(i < 10)
		{
			print("%d x %d = %d \n", dan, i, dan*i);
			i++;
		}
	}
	public static void print(String s, Object... a )
	{
		System.out.printf(s, a);
	}
	public static boolean evalution(int point)
	{
		if(point >= 40)
		{
	
			return true;
		}
		print("과락 입니다 ");
		return false;
	}
	public static boolean evalution(int point, int point2, int point3)
	{
		if((point+ point2 + point3) >= 180)
		{
			return true;
		}
		return false;
	}

}


