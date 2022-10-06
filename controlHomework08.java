import java.util.Scanner;
public class controlHomework08{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入数列的终值，若是输入非整数会转化为整数（即直接舍弃小数）");
		double right = myScanner.nextDouble();//读取数据
		int end;
		int sum2 = 0;//定义加和的变量
		end =(int)right;//强转为int类型
		int turn = 1;//变量初始化
		for(;turn <= end;turn++){//大循环开始
			int sum1 = 0;
			for(int number = 0;number <= turn;number++){//小循环开始
				sum1 += number;//每一项加和
			}
			sum2 += sum1;//项与项的加和
		}
		System.out.println("当数列终值为"+ right +"时，和=" + sum2);
	}
}