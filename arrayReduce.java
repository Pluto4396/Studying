//���������е�Ԫ�أ��ҹ涨ÿ�ζ���������Ǹ�Ԫ�ء�
import java.util.Scanner;
public class arrayReduce{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6};
		for(int l1 = 0;l1 < arr.length;l1++){
					System.out.print(arr[l1] + "\t");
				}
		while(true){
			int n = arr.length-1;
			if (n < 1) {
				System.out.println("�޷��������Ƴ�����");
				break;
			}
			int[] arrNew = new int[n];	
			int i = 0;		
			for (;i < n;i++ ) {
			arrNew[i] = arr[i];	
				}
			arr = arrNew;
			System.out.println("�Ƿ�Ҫ������������(y/n)");
			char answer = myScanner.next().charAt(0);
			if (answer == 'y') {
				for(int l = 0;l < arr.length;l++){
					System.out.print(arr[l] + "\t");
				}

				}
			else if (answer == 'n') {
				break;
			}else{
				System.out.println("�����������,�����˳�");
				break;
			}

		}
	}
}