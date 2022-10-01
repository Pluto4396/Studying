import java.util.Scanner;
public class whileHomework02{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入左边界");
		int num1 = myScanner.nextInt();
		System.out.println("请输入右边界");
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
			System.out.println("输入有误");
		}
	}
	}
