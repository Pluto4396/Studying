public class objectHomework11 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        PassObject passObject = new PassObject();
        passObject.printAreas(circle1,5);
    }
}


class Circle1{
    public double findArea(double radius){//计算圆的面积
        return Math.PI * radius * radius;
    }
}


class PassObject{
    public void printAreas(Circle1 c,int times){
        for (int i = 1; i <= times ; i++) {
            System.out.println("圆的半径是" + i);
            System.out.println("当圆的半径是" + i + "，圆的面积是" + c.findArea(i));
        }
    }
}