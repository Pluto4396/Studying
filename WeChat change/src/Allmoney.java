import java.text.SimpleDateFormat;
import java.util.Date;

public class Allmoney extends Firstway{
    private double allmoney;
    private String time;

    public double getAllMoney() {
        return allmoney;
    }

    public void setAllMoney(double money) {
        this.allmoney += money;
    }
    public void setTime() {//赋值时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String time = sdf.format(new Date());
        this.time = time;
    }

    public String getTime() {
        return time;
    }

}
