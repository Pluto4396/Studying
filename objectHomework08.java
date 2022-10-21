public class objectHomework08 {
    public static void main(String[] args) {
        Music music = new Music("南方姑娘",332);
        music.play();
        System.out.println(music.getInfo());music.getInfo();
    }
}
class Music{
    String name;
    double times;
    public Music(String name,int times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("音乐" + name + "正在播放...时长" + times + "秒");
    }
    public String getInfo(){
        return "音乐" + name + "正在播放...时长" + times + "秒";
    }
}