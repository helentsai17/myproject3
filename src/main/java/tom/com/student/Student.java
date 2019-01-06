package tom.com;

public class Student {
    String id;
    String name;
    int math;
    int english;

    public Student(String id, String name, int math, int english) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void print(){
        System.out.println(name+" "+math+" "+english+" "+((english+math)/2));
    }
}
