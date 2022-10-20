public class objectHomework02 {
    public static void main(String[] args) {
        String arr[] = {"mary", "jack", "tom", "jerry"};
        A02 a02 = new A02();
        if (a02.find(arr).equals("-1")) {
            System.out.println("找不到");
        } else {
            System.out.println(a02.find(arr));
        }
    }
}

class A02 {
    public String find(String[] arr) {
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("mary")) {
                n = i;
                return arr[i];
            }
        }
        return "-1";
    }
}
