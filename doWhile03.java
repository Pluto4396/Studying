//打印可以被五整除但不能被三整除的数
import java.util.Scanner;
public class doWhile03{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入数字的左边界");
		int num1 = myScanner.nextInt();
		System.out.println("请输入数字的右边界");
		int num2 = myScanner.nextInt();//接收数据
		if(num1 <= num2){//判断给出数据有没有问题
			int n = num1;//循环变量初始化
			do{//循环开始
				if(n % 5 == 0 && n % 3 != 0){//找出这些符合要求的数并打印
					System.out.println(n);
				}n++;//循环变量迭代
			}while(n <= num2);//循环变量条件
		}else{
			System.out.println("输入有问题");
		}
	}
}