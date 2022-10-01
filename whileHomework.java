import java.util.Scanner;
public class whileHomework{
	public static void main(String[]args){
	Scanner myScanner = new Scanner(System.in);
	System.out.println("请输入数字的左边界");
	int num1 = myScanner.nextInt();
	System.out.println("请输入数字的右边界");
	int num2 = myScanner.nextInt();
	int i = num1;
	while(i <= num2);{
		if (i % 3 == 0 ) {
			System.out.println(i);
			}
		i++;	
		}
	}
	
}  
	
