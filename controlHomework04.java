//��һ�������ǲ���ˮ������ˮ������ָÿ��λ�ϵ����ֵ������������������Լ���
import java.util.Scanner;
public class controlHomework04{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ����λ�������������������ת��Ϊ��������ֱ������С����");//�ж�
		double number = myScanner.nextDouble();
		int number1 ;
		number1 = (int)number;
		if(number1 >= 100 && number1 <1000){
			int first = number1 / 100;
			int second = (number1 % 100) / 10;
			int third = number1 % 10;//ȡ��ÿ��λ�ϵ�����
			if(number1 == (first*first*first) + (second*second*second) + (third*third*third)){
				System.out.println(number1 + "��һλˮ����");
			}else{
				System.out.println(number1 + "����һλˮ����");//�ж�
			}
		}else{
			System.out.println("������һ����λ��");//����
		}
	}
}