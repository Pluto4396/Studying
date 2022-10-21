public class objectHomework04 {
    public static void main(String[] args) {
        int[] arr1 = {1,5,9,12,65,55,1,9};
        A03 a03 = new A03();
        int[] arr2 = a03.copyArr(arr1);
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j]+" ");
        }
    }
}
class A03{//用于实现数组复制
public int[] copyArr(int[] arr){
    int[] arrNew = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        arrNew[i]=arr[i];
    }
    return arrNew;
    }
}