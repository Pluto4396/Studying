public class Control extends Forthway{
    public void control1(){
    double n = choose();
        if (n == 2){
          Secondway secondway = new Secondway();
            secondway.infor();
        } else if (n == 3) {
            Thirdway thirdway = new Thirdway();
            thirdway.infor();
        } else if (n == 4) {
            exit_();
        }
    }
}
