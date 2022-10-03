import java.util.Scanner;
public class thesePractise{
	public static void main(String[]args){
	Scanner myScanner = new Scanner(System.in);
	System.out.println("请输入班级数量");
	int num1 = myScanner.nextInt();
	System.out.println("请输入每个班级人数");//暂时水平有限，先练习每个班级的人数都一样
	int num2 = myScanner.nextInt();
	int n = 0;
	double sum2 = 0;
	for (int class1 = 1;class1 <= num1;class1++) {
		double sum1 = 0;
		for(int student1 = 1;student1 <= num2;student1++){
			System.out.println("请输入该同学成绩");
			double score = myScanner.nextDouble();
			System.out.println("第" + class1 +"班的第" + student1 +"个同学的分数为" + score); 
			sum1 = score + sum1;
			if (score >= 60.0) {
				n++;			
				}
			}
		double average1 = (sum1 / num2);
		System.out.println("第" + class1 + "班的平均分为" + average1);
		sum2 = average1 + sum2;
		
		}
	double average2 = (sum2 / num1);
	System.out.println("全体平均分为" + average2);
	System.out.println(num1 + "个班级的总及格人数为" + n +"人");
	}		
}