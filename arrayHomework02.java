import java.util.Scanner;
public class arrayHomework02{
	public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	System.out.println("������������е����ָ���");
	int number1 = myScanner.nextInt();//��������
	int array[] = new int[number1];
	for (int j = 0;j < array.length;j++ ) {
		int number = (int)(Math.random()*100);
		array[j] = number;
		}//������ȡ1����100�������
		int sum = 0;
		for(int i = array.length - 1;i >= 0;i--){
			System.out.print(array[i] + " ");//��ӡ����
			sum += array[i];
			if(array[i] == 8){
				System.out.println("���ɵ�����������а�");
			}
		}//��Ͳ��ж���������û�а�
		int temp = array[0];
		int max = 0;
		for(int i = 0;i < array.length - 1;i++){
		if (temp < array[i + 1]) {
			temp = 	array[i + 1];
			 max = (i + 1);
			}//�����ֵ�����±�
		}
		int max1 = max + 1;
		double average = sum/number1;//��ƽ����
		System.out.println("��������ƽ����Ϊ" + average);
		System.out.println("�����������ֵΪ" + temp);
		System.out.println("�����������ֵ�ǵ�" + max1 + "������");
	}
}