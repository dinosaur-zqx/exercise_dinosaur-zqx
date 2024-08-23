public class testPhone {
    public static void main(String[] args) {
        phone p = new phone();
        p.setBrand("小米");
        p.setColor("黑");
        p.setPrice(3998);

        p.call();
        p.sendMessage();
    }
}
