public class  arrayExercise02{
	public static void main(String[]args){
		int[] array = {4,-1,9,10,23};
		int end = 0;
		for (int i = 0;i < (array.length - 1);i++ ) {//��������
			int n = 0;
			n = i + 1;
			if (array[i] <= array[n]) {//�Ƚ�
				end = array[n];
			}else{
				end = array[i];
			}
			
		}
		System.out.print("�����Ϊ" + end);//���
	}
}
// ��ʦ���Ż���
// int[] array = {4,-1,9,10,23};
// int max = array[0];
// int maxIndex = 0;
// for (int i = 0;i < array.length;i++ ) {
// if(max < array[i]){
// max = array[i];
// }
// }