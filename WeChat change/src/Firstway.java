public class Firstway {
    private int i = 0;

    public int getI() {
        return i;
    }

    public void setI() {
        i++;
        this.i = i;
    }

    public void remember(){
        setI();
    }

}
