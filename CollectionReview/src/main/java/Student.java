import java.util.Objects;

public class Student {
    int id;
    String name;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student (int id, String name){
        this.id=id;
        this.name=name;

    }

    @Override
    public boolean equals(Object obj) {

        if (this==obj) return true;
        if(obj==null || getClass()!= obj.getClass()) return false;
        Student student=(Student) obj;
        return id== student.id && Objects.equals(name,student.name);




    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
