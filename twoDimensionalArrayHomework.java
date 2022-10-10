//打印一个十行的杨辉三角
//使用先死后活思想，调整输入行数
import java.util.Scanner;
public class twoDimensionalArrayHomework{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入想要打印的杨辉三角的行数");
		int n = myScanner.nextInt();
		int array[][] = new int[n][];//十行
		for (int i = 0;i < array.length;i++) {
			array[i] = new int[i + 1];//给与每一行该有的空间
		}
		for (int x = 0;x < array.length ; x++) {//行是x
			for (int y = 0;y < array[x].length;y++ ) {//列是y
				if (x == 0){//先赋值杨辉三角第一行的1
					array[x][y] = 1;
				}
				else if (y == 0 || x == y) {//赋值其他行第一列的1
					array[x][y] = 1;
				}else{
					array[x][y] = array[x-1][y] + array[x-1][y-1];
				}
			}//内层for循环
		}//外层for循环
		for (int a = 0; a < array.length; a++) {//打印杨辉三角
			for (int b = 0;b < array[a].length; b++) {
				if (a == b) {
					System.out.println(array[a][b]);
				}else{
					System.out.print(array[a][b] + "\t");
				}
			}
		}
	}
}