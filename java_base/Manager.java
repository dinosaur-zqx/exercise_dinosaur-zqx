public class Manager {
    private String name;
    private String id;
    private double salary;
    private double bonus;

    //构造方法
    public Manager(){
    }
    public Manager(String name, String id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
    //set/get方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //work方法
    public void work(){
        System.out.println("工号为" + id + "基本工资为" + salary + "奖金为" + bonus + "的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
