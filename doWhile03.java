//��ӡ���Ա������������ܱ�����������
import java.util.Scanner;
public class doWhile03{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������ֵ���߽�");
		int num1 = myScanner.nextInt();
		System.out.println("���������ֵ��ұ߽�");
		int num2 = myScanner.nextInt();//��������
		if(num1 <= num2){//�жϸ���������û������
			int n = num1;//ѭ��������ʼ��
			do{//ѭ����ʼ
				if(n % 5 == 0 && n % 3 != 0){//�ҳ���Щ����Ҫ���������ӡ
					System.out.println(n);
				}n++;//ѭ����������
			}while(n <= num2);//ѭ����������
		}else{
			System.out.println("����������");
		}
	}
}