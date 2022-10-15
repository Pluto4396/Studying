//使用递归的方法打印出斐波那契数列
import java.util.Scanner;
public class fatorialExercise{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入斐波那契数列的个数");
		int n = myScanner;
		if (n > 0) {
		Tools number = new Tools();
		int arr[] = new int[n];
		for (int i = 0;i < n;i++ ) {
			arr[i] = number.number(i+1);
		}
		for (int j = 0;j < n ;j++ ) {
			System.out.print(arr[j] + " ");
		}
	}else{System.out.println("请输入大于零的整数")}
	}
}
class Tools{
	public int number(int n){
		if (n ==1 || n == 2) {
			return 1;
		}else{
			return number(n - 1) + number(n - 2);
		}
	}
	
}