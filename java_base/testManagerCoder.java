public class testManagerCoder {
    public static void main(String[] args) {
        Manager m = new Manager("123","张三",15000,6000);
        m.work();
        Coder c = new Coder("135","李四",10000);
        c.work();
    }
}
