public class Overload02{
	public static void main(String[] args) {
		Methods abc = new Methods();
		int n1 = abc.max(5,6);
		double n2 = abc.max(5.2,6.3);
		double n3 = abc.max(5.2,6.3,9.2);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
}
class Methods{
	public int max(int n1,int n2){
		if (n1 >= n2) {
			return n1;
		}else
		return n2;
	}
	public double max(double n1,double n2){
		if (n1 >= n2) {
			return n1;
		}else
		return n2;
	}
	public double max(double n1,double n2,double n3){
		if (n1 >= n2) {	
	 if(n1 >= n3){
		return n1;
	}else {
		return n3;
	}
}
	if (n1 < n2) {
		if(n2 >= n3){
			return n2;
		}else{
			return n3;
		}
		
	}return -1;
}
}