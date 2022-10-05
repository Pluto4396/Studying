import java.util.Scanner;
public class controlHomework02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数，若是输入非整数会转化为整数（即直接舍弃小数）");
		double number = myScanner.nextDouble();
		number = (int)number;
		if(number != 0){
			if(number > 0){
				System.out.println("大于零");
			}
			if(number < 0){
				System.out.println("小于零");
			}
		}else{
			System.out.println("等于零");
		}
	}
}		