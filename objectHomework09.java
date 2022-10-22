public class objectHomework09 {
    public static void main(String[] args) {
        Text text = new Text();
        System.out.println(text.method(text.method(10.0,20.0),100));
    }
}
class Text{
    public double method(double n1,double n2){
       return n1 + n2;
    }
}