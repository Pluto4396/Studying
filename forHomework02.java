import java.util.Scanner;
public class forHomework02{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������Ҫд������ʽ�ĺ�");
		int num = myScanner.nextInt();
		for (int i = 0; i <= num;i++ ) {
			System.out.println(i + "+" + (num - i) + "=" + num);
		}
	}
}