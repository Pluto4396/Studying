import java.util.Scanner;
public class thesePractise{
	public static void main(String[]args){
	Scanner myScanner = new Scanner(System.in);
	System.out.println("������༶����");
	int num1 = myScanner.nextInt();
	System.out.println("������ÿ���༶����");//��ʱˮƽ���ޣ�����ϰÿ���༶��������һ��
	int num2 = myScanner.nextInt();
	int n = 0;
	double sum2 = 0;
	for (int class1 = 1;class1 <= num1;class1++) {
		double sum1 = 0;
		for(int student1 = 1;student1 <= num2;student1++){
			System.out.println("�������ͬѧ�ɼ�");
			double score = myScanner.nextDouble();
			System.out.println("��" + class1 +"��ĵ�" + student1 +"��ͬѧ�ķ���Ϊ" + score); 
			sum1 = score + sum1;
			if (score >= 60.0) {
				n++;			
				}
			}
		double average1 = (sum1 / num2);
		System.out.println("��" + class1 + "���ƽ����Ϊ" + average1);
		sum2 = average1 + sum2;
		
		}
	double average2 = (sum2 / num1);
	System.out.println("ȫ��ƽ����Ϊ" + average2);
	System.out.println(num1 + "���༶���ܼ�������Ϊ" + n +"��");
	}		
}