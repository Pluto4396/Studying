//猴子吃桃的问题
public class fatorialExercise02{
	public static void main(String[] args) {
		myTools n1 = new myTools();
		int n = 0;
		n = n1.multiplication(1,1);
		System.out.println(n);
	}
}
class myTools{
	public int multiplication(int n,int i){
		int n2 =(n+1)*2; 
		if (i < 10) {
			return multiplication (n2,i+1);

		}return n2;

	}
}