import java.util.Scanner;
public class controlHomework08{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������е���ֵ�����������������ת��Ϊ��������ֱ������С����");
		double right = myScanner.nextDouble();//��ȡ����
		int end;
		int sum2 = 0;//����Ӻ͵ı���
		end =(int)right;//ǿתΪint����
		int turn = 1;//������ʼ��
		for(;turn <= end;turn++){//��ѭ����ʼ
			int sum1 = 0;
			for(int number = 0;number <= turn;number++){//Сѭ����ʼ
				sum1 += number;//ÿһ��Ӻ�
			}
			sum2 += sum1;//������ļӺ�
		}
		System.out.println("��������ֵΪ"+ right +"ʱ����=" + sum2);
	}
}