public class methodExercise02{
	public static void main(String[] args) {
       Fangfa n = new Fangfa();
       n.square(4,4,'e');
	}

}
class Fangfa{
		 static void square(int row, int col, char n){
			for (int i = 0; i <= row;i++) {
				for (int j = 0;j <= col ;j++) {
					System.out.print(n);	
				}
				System.out.println();
			}
		}
	}

