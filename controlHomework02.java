import java.util.Scanner;
public class controlHomework02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ�����������������������ת��Ϊ��������ֱ������С����");
		double number = myScanner.nextDouble();
		number = (int)number;
		if(number != 0){
			if(number > 0){
				System.out.println("������");
			}
			if(number < 0){
				System.out.println("С����");
			}
		}else{
			System.out.println("������");
		}
	}
}		