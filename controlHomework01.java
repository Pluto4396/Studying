import java.util.Scanner;
public class controlHomework01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的持有钱数");
		double money = myScanner.nextDouble();
		int n = 0;
		while(money > 50000){
			money = money * 0.95;
			n++;
		}	
		while(money <= 50000){
			money = money - 1000;
			n++;
			if(money < 1000){
			break;
			}
		}
		System.out.println("您可以通过"+ n +"个路口");
		System.out.println("还剩" + money +"钱");
	}
}