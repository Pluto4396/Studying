//输出一个整数列中不能被五整除的数字，每五个一行
import java.util.Scanner;
public class controlHomework05{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入数列的左边界，若是输入非整数会转化为整数（即直接舍弃小数）");
		double left = myScanner.nextDouble();
		int left1;
		left1 = (int)left;//取数列左边界，保证为整数
		System.out.println("请输入数列的右边界，若是输入非整数会转化为整数（即直接舍弃小数）");
		double right = myScanner.nextDouble();
		int right1;
		right1 = (int)right;//取数列右边界，保证为整数
		if(left1 <= right1){//确保数列不会出错
			int n = left1;
			int count = 0;//赋值下面的变量数字，用来计数
			for (;n <= right1;n++) {//打印不能被五整除的数字
			if(n % 5 != 0){
				System.out.print(n + "\t");	
				count++;//记录打印了几个数字
					}
					
			if (count % 5 == 0 ) {//实现每五个一行
				System.out.print("\n");
				}
			}
		}else{
			System.out.println("左边界应该小于右边界");
		}
	}
}		