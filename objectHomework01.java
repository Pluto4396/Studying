public class objectHomework01 {
    public static void main(String[] args) {
        double arr[] = {2.0,3.5,6.0,7.8,5.9,12.5};
        A01 max1 = new A01();
        max1.compera(arr);
    }
}
class A01{
    public void compera(double[] arr){
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println(max);
    }
}

