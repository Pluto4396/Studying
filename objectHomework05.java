public class objectHomework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.perimeter();
        circle.area();
    }
}
class Circle{
    int radius;
    public Circle(int m){//传输半径
        this.radius=m;
    }
    public void perimeter(){//圆的周长
        double n = radius * 2 * 3.1415926535;
        System.out.println("圆的周长为"+n);
    }
    public void area(){//圆的面积
        double n = radius * radius * 3.1415926535;
        System.out.println("圆的面积"+n);
    }
}