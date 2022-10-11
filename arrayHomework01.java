import java.util.Scanner;
public class arrayHomework01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int array[] = {10,12,45,90};//定义数组
		for(int i = 0;i < array.length;i++){
			System.out.print(array[i] + " ");//打印数组
		}
		System.out.println("输入插入数组的数字");
		int number = myScanner.nextInt();//接受数据
		int arrayNew[] = new int[array.length + 1];
		for (int j = 0;j < array.length;j++ ) {
			arrayNew[j] = array[j];
		}
		arrayNew[array.length] = number;//给数组添加数据
		array = arrayNew;
		int temp = 0;
		for (int x = array.length - 1;x > 0; x--) {
			if (array[x] < array[x-1]) {
				temp = array[x];
				array[x] = array[x-1];
				array[x-1] = temp;
			}else{
				break;
			}
		}//排序完成
		for(int y = 0;y < array.length;y++){
			System.out.print(array[y] + " ");//打印数组
		}
	}
}