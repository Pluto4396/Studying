import java.util.Scanner;
public class forHomework02{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入要写出的算式的和");
		int num = myScanner.nextInt();
		for (int i = 0; i <= num;i++ ) {
			System.out.println(i + "+" + (num - i) + "=" + num);
		}
	}
}