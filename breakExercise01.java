public class breakExercise01{
	public static void main(String[]args){
		int sum = 0;
		for(int num = 1;num <= 100; num++){
			sum += num;
			if(sum > 20){
				System.out.print("���ʹ��ڶ�ʮ��ʱ�򣬴�ʱ������Ϊ" + num);
				break;
			}
		}
	}
}