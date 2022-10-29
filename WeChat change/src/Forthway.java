import java.util.Scanner;

public class Forthway extends Menu{
    public void exit_(){
        System.out.println("是否要退出（y/n）（默认只读取第一个字节）");
        Scanner scanner = new Scanner(System.in);
        char n = scanner.next().charAt(0);
        if (n == 'y'){
        } else if (n == 'n') {
            choose();
            exit_();
        }else{
            System.out.println("您的输出有误已退出程序");
        }
    }
}
