public class Student extends Person {
    public Student(String name, String classNum) {
        super(name,classNum);
    }

    @Override
    public void introuduce() {
        System.out.println("Name is " + this.getName());
    }

    @Override
    public void getClass1() {
        System.out.println(super.classNum);
    }
}
