import java.util.Scanner;
public class doWhile01and02{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入数字的左边界");
		int num1 = myScanner.nextInt();
		System.out.println("请输入数字的右边界");
		int num2 = myScanner.nextInt();
		int n = num1;
		if(num1 <= num2){
			do{
				System.out.println(n);
				n++;
			}while(n <= num2);
		}else{
			System.out.println("输入有误");
		}
	}
}