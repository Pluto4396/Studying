//打印出一个空心菱形
import java.util.Scanner;
public class stars{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入行数(奇数)");//接收数据
		int line = myScanner.nextInt();
		if(line % 2 == 1){
		//第一步，先打印出一个正方形
		//第二步，将正方形变成菱形
		//第三步，挖空这个菱形
		for (int l = 1;l <= line;l++ ) {//第一次大循环开始
			for (int space1 = 1;space1 <= (line-l) ;space1++ ) {//空格
				System.out.print(" ");
			}
			for (int row = 1; row <= (l * 2- 1); row++) {//菱形上半部分
				if(row == 1 || row == (l * 2- 1)){
				System.out.print("*");
					}
					else{
					System.out.print(" ");
						}//挖空上半部分的菱形
				}
			System.out.println();
			}//第一次大循环结束
		for (int l0 = line - 1;l0 >= 1;l0-- ) {//第二次大循环开始
			for (int space2 = 0;space2 <=line - l0 - 1;space2++ ) {//空格
				System.out.print(" ");
			}
			for (int row = 1; row <= (l0 * 2- 1); row++) {//菱形下半部分
				if (row == 1 || row == (l0 * 2- 1)) {
				System.out.print("*");
				}
				else{
					System.out.print(" ");
						}//挖空下半部分的菱形
				}
			System.out.println();
			}//第二次大循环结束
		}else{
			System.out.println("你的输入有误");
		}
	}
}