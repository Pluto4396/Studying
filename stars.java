//��ӡ��һ����������
import java.util.Scanner;
public class stars{
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������(����)");//��������
		int line = myScanner.nextInt();
		if(line % 2 == 1){
		//��һ�����ȴ�ӡ��һ��������
		//�ڶ������������α������
		//���������ڿ��������
		for (int l = 1;l <= line;l++ ) {//��һ�δ�ѭ����ʼ
			for (int space1 = 1;space1 <= (line-l) ;space1++ ) {//�ո�
				System.out.print(" ");
			}
			for (int row = 1; row <= (l * 2- 1); row++) {//�����ϰ벿��
				if(row == 1 || row == (l * 2- 1)){
				System.out.print("*");
					}
					else{
					System.out.print(" ");
						}//�ڿ��ϰ벿�ֵ�����
				}
			System.out.println();
			}//��һ�δ�ѭ������
		for (int l0 = line - 1;l0 >= 1;l0-- ) {//�ڶ��δ�ѭ����ʼ
			for (int space2 = 0;space2 <=line - l0 - 1;space2++ ) {//�ո�
				System.out.print(" ");
			}
			for (int row = 1; row <= (l0 * 2- 1); row++) {//�����°벿��
				if (row == 1 || row == (l0 * 2- 1)) {
				System.out.print("*");
				}
				else{
					System.out.print(" ");
						}//�ڿ��°벿�ֵ�����
				}
			System.out.println();
			}//�ڶ��δ�ѭ������
		}else{
			System.out.println("�����������");
		}
	}
}