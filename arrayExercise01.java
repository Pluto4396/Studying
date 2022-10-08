public class  arrayExercise01{
	public static void main(String[]args){
		char[] alb = new char[26];
	for (int i = 0;i < alb.length;i++) {
		alb[i] = (char)(97 + i);
		System.out.print(alb[i] + " ");
	
		}
	}
}
	