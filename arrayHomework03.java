//����ð������(��С����)
import java.util.Scanner;
public class arrayHomework03{
	public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	System.out.println("������������е����ָ���");
	int number1 = myScanner.nextInt();//��������
	int array[] = new int[number1];//���������������
	for (int j = 0;j < array.length;j++ ) {
		int number = (int)(Math.random()*100);
		array[j] = number;
		}//������ȡ1����100�������
		//����
	for (int k = array.length - 1; k > 0;k-- ) {
		for (int i = 0;i < k; i++) {
			if (array[i] > array[i+1]) {
			int temp = 0;
			temp = array[i+1];
			array[i+1] = array[i];
			array[i] = temp;
				}//if
			}//forsmall
		}//forbig
			for(int y = 0;y < array.length;y++){
			System.out.print(array[y] + " ");//��ӡ����
		}
	}//main
}