import java.util.Scanner;
public class breakExercise02{
	public static void main(String[]args){
	Scanner myScanner = new Scanner(System.in);
	int num = 1;
	for(; num <= 3; num++){
		System.out.println("请输入账户名称");
		String  username = myScanner.next();
		System.out.println("请输入密码");
		String password = myScanner.next();//读取用户信息
		if(username.equals("丁真") && password.equals("666")){
				System.out.println("登陆成功");
				break;
			}else{
				System.out.println("账号或密码输入不正确，还有"  + (3 - num)  +  "次机会");
			}
			if(num == 3 ){
				System.out.println("登录请求过于频繁，请一个小时后再登录");
			}
			}
		}
	}
