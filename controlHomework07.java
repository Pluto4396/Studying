//����1/1 + 1/2 + 3/1 + .......+ 1/n������еĺ�
import java.util.Scanner;
public class controlHomework07{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������������һ���ĸ��ֵ�����������������ת��Ϊ��������ֱ������С����");
		double right = myScanner.nextDouble();//��ȡ����
		int end;
		end = (int)right;
		double start = 1;
		double sum = 0;//�����¼�����õı���
		for(;start <= end;start++){
			if(start % 2 != 0){
			sum += (1 / start);//����
		}
		if(start % 2 == 0 ){
			sum -= (1 / start);
		}
		}
		System.out.println("���еĺ�Ϊ" + sum);
	}
}	