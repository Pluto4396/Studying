//���һ���������в��ܱ������������֣�ÿ���һ��
import java.util.Scanner;
public class controlHomework05{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������е���߽磬���������������ת��Ϊ��������ֱ������С����");
		double left = myScanner.nextDouble();
		int left1;
		left1 = (int)left;//ȡ������߽磬��֤Ϊ����
		System.out.println("���������е��ұ߽磬���������������ת��Ϊ��������ֱ������С����");
		double right = myScanner.nextDouble();
		int right1;
		right1 = (int)right;//ȡ�����ұ߽磬��֤Ϊ����
		if(left1 <= right1){//ȷ�����в������
			int n = left1;
			int count = 0;//��ֵ����ı������֣���������
			for (;n <= right1;n++) {//��ӡ���ܱ�������������
			if(n % 5 != 0){
				System.out.print(n + "\t");	
				count++;//��¼��ӡ�˼�������
					}
					
			if (count % 5 == 0 ) {//ʵ��ÿ���һ��
				System.out.print("\n");
				}
			}
		}else{
			System.out.println("��߽�Ӧ��С���ұ߽�");
		}
	}
}		