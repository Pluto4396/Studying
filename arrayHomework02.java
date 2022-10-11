import java.util.Scanner;
public class arrayHomework02{
	public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	System.out.println("输入随机数组中的数字个数");
	int number1 = myScanner.nextInt();//接受数据
	int array[] = new int[number1];
	for (int j = 0;j < array.length;j++ ) {
		int number = (int)(Math.random()*100);
		array[j] = number;
		}//给数组取1——100的随机数
		int sum = 0;
		for(int i = array.length - 1;i >= 0;i--){
			System.out.print(array[i] + " ");//打印数组
			sum += array[i];
			if(array[i] == 8){
				System.out.println("生成的随机数组中有八");
			}
		}//求和并判断数组中有没有八
		int temp = array[0];
		int max = 0;
		for(int i = 0;i < array.length - 1;i++){
		if (temp < array[i + 1]) {
			temp = 	array[i + 1];
			 max = (i + 1);
			}//找最大值及其下标
		}
		int max1 = max + 1;
		double average = sum/number1;//求平均数
		System.out.println("随机数组的平均数为" + average);
		System.out.println("随机数组的最大值为" + temp);
		System.out.println("随机数组的最大值是第" + max1 + "个数字");
	}
}