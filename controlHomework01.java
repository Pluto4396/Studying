import java.util.Scanner;
public class controlHomework01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ĳ���Ǯ��");
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
		System.out.println("������ͨ��"+ n +"��·��");
		System.out.println("��ʣ" + money +"Ǯ");
	}
}