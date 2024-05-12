class Student {
    private int age;
    private String name;

    void setData(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(age + " " + "name");
    }
}

public class Demo {

    public static void main(String[] args) {
        Student ob = new Student();
        ob.setData(19);
        ob.show();
    }

}