import java.util.Scanner;
public class arrayHomework01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int array[] = {10,12,45,90};//��������
		for(int i = 0;i < array.length;i++){
			System.out.print(array[i] + " ");//��ӡ����
		}
		System.out.println("����������������");
		int number = myScanner.nextInt();//��������
		int arrayNew[] = new int[array.length + 1];
		for (int j = 0;j < array.length;j++ ) {
			arrayNew[j] = array[j];
		}
		arrayNew[array.length] = number;//�������������
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
		}//�������
		for(int y = 0;y < array.length;y++){
			System.out.print(array[y] + " ");//��ӡ����
		}
	}
}