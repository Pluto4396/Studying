import java.util.Scanner;
public class breakExercise02{
	public static void main(String[]args){
	Scanner myScanner = new Scanner(System.in);
	int num = 1;
	for(; num <= 3; num++){
		System.out.println("�������˻�����");
		String  username = myScanner.next();
		System.out.println("����������");
		String password = myScanner.next();//��ȡ�û���Ϣ
		if(username.equals("����") && password.equals("666")){
				System.out.println("��½�ɹ�");
				break;
			}else{
				System.out.println("�˺Ż��������벻��ȷ������"  + (3 - num)  +  "�λ���");
			}
			if(num == 3 ){
				System.out.println("��¼�������Ƶ������һ��Сʱ���ٵ�¼");
			}
			}
		}
	}
