//计算1/1 + 1/2 + 3/1 + .......+ 1/n这个数列的和
import java.util.Scanner;
public class controlHomework07{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入数列最后一项分母的值，若是输入非整数会转化为整数（即直接舍弃小数）");
		double right = myScanner.nextDouble();//读取数据
		int end;
		end = (int)right;
		double start = 1;
		double sum = 0;//定义记录数据用的变量
		for(;start <= end;start++){
			if(start % 2 != 0){
			sum += (1 / start);//计算
		}
		if(start % 2 == 0 ){
			sum -= (1 / start);
		}
		}
		System.out.println("数列的和为" + sum);
	}
}	