import java.net.SocketPermission;

public class GirlFriend {
    private String name;
    private double height;
    private double weight;

    //构造方法
    public GirlFriend(){
    }
    public GirlFriend(String name,double height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    //set/get方法
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    //方法
    public void show(){
        System.out.println("我女朋友叫"+name+",身高"+height+"厘米,体重"+weight+"斤");
    }
    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }
    public void cook(){
        System.out.println("女朋友给我做饭");
    }
}
