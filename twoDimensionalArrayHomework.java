//��ӡһ��ʮ�е��������
//ʹ���������˼�룬������������
import java.util.Scanner;
public class twoDimensionalArrayHomework{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ��������ǵ�����");
		int n = myScanner.nextInt();
		int array[][] = new int[n][];//ʮ��
		for (int i = 0;i < array.length;i++) {
			array[i] = new int[i + 1];//����ÿһ�и��еĿռ�
		}
		for (int x = 0;x < array.length ; x++) {//����x
			for (int y = 0;y < array[x].length;y++ ) {//����y
				if (x == 0){//�ȸ�ֵ������ǵ�һ�е�1
					array[x][y] = 1;
				}
				else if (y == 0 || x == y) {//��ֵ�����е�һ�е�1
					array[x][y] = 1;
				}else{
					array[x][y] = array[x-1][y] + array[x-1][y-1];
				}
			}//�ڲ�forѭ��
		}//���forѭ��
		for (int a = 0; a < array.length; a++) {//��ӡ�������
			for (int b = 0;b < array[a].length; b++) {
				if (a == b) {
					System.out.println(array[a][b]);
				}else{
					System.out.print(array[a][b] + "\t");
				}
			}
		}
	}
}