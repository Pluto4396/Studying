import java.util.Scanner;
public class whileHomework02{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������߽�");
		int num1 = myScanner.nextInt();
		System.out.println("�������ұ߽�");
		int num2 = myScanner.nextInt();
		int i = num1;
		if(num1 <= num2){
			int n = num1;
			while(n <= num2){
				if(n % 2 == 0){
					System.out.println(n);
				}
						n++;

			}
		}else{
			System.out.println("��������");
		}
	}
	}
