public class Dog {
    private String color;
    private String breed;
    //构造方法
    public Dog(){
    }
    public Dog(String color, String breed){
        this.color = color;
        this.breed = breed;
    }
    //set/get方法
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    //行为方法
    public void eat() {
        System.out.println(color + "色的" + breed + "正在啃骨头.....");
    }
    public void lookHome() {
        System.out.println(color + "色的" + breed + "正在看家.....");
    }
}
