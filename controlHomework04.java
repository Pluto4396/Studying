//求一个数字是不是水仙数（水仙数是指每个位上的数字的立方加起来等于它自己）
import java.util.Scanner;
public class controlHomework04{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个三位数，若是输入非整数会转化为整数（即直接舍弃小数）");//判断
		double number = myScanner.nextDouble();
		int number1 ;
		number1 = (int)number;
		if(number1 >= 100 && number1 <1000){
			int first = number1 / 100;
			int second = (number1 % 100) / 10;
			int third = number1 % 10;//取出每个位上的数字
			if(number1 == (first*first*first) + (second*second*second) + (third*third*third)){
				System.out.println(number1 + "是一位水仙数");
			}else{
				System.out.println(number1 + "不是一位水仙数");//判断
			}
		}else{
			System.out.println("请输入一个三位数");//报错
		}
	}
}