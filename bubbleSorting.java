//ð������˼·���������ʵ��
public class bubbleSorting{
	public static void main(String[] args) {
		int array[] =  {6,9,8,4,50,84,35,78};//����һ������
		//��һ��Ӧ�ý���������һ�����ŵ����
		//�ڶ������ҳ����ɡ�
		//�����������ɱ仯Ϊһ���ⲿѭ��
		//���Ĳ�����������
		for(int i = 0; i < array.length-1;i++){
		 for (int j = 0; j < array.length-1-i; j++) {
		 	if (array[j] > array[j+1]) {
		 		int temp = 0;
		 		temp = array[j];
		 		array[j] = array[j+1];
		 		array[j+1] = temp;
		 	}
		 }
		 System.out.print("\n" + "��" + (i+1) + "��������������");
		 for (int num = 0;num < array.length ; num++) {
		 	System.out.print(array[num] + "\t");
		 }
}
		 // for (int j = 0; j < 7; j++) {
		 // 	int count = 0;//�������Ż���������û����ʱֱ���˳�
		 // 	if (array[j] > array[j+1]) {
		 // 		int temp = 0;
		 // 		temp = array[j];
		 // 		array[j] = array[j+1];
		 // 		array[j+1] = temp;
		 // 		count++;
		 // 	}
		 // 	if (count == 0) {
		 // 		break;
		 // 	}
		 // }
		 // System.out.print("\n" + "��" + "��������������")
		 // for (int num = 0;num < array.length ; num++) {
		 // 	System.out.print(array[num] + "\t");
		 // }
	}
}