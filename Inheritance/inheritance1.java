class human {
    int age;
    protected String name;
    {
        age = 18;
        name = "Krishna";
    }

    void disp() {
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class student extends human {

}

public class inheritance1 {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.age);
        System.out.println(s.name);
    }
}