import java.util.Scanner;
public class controlHomework03{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ�����");
		int year = myScanner.nextInt();
		if((year % 4 == 0 && year % 100 != 0)||year % 400 == 0 ){
			System.out.println(year + "��������");
		}else{
			System.out.println(year + "�겻������");
		}
	}
}