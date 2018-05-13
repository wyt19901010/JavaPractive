public abstract class Person implements ClassNum {
    protected   String name;
    protected   String classNum;

    public Person ( String name , String classNum) {
        this.name = name;
        this.classNum = classNum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract void introuduce() ;
}
