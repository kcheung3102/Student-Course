import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int year;
    private ArrayList<Course> courses;

    public Student(){};

    public Student(String name, int age, int year, ArrayList<Course> courses) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String displayText() {
        String str = "";
        str += name + "||"  + "Age:" + age + " Year:" + year + "\n";
        for (Course c: courses) {
            str +=c.getCourseName() + ": " + c.getCourseInfo() + "\n " + "Grade:" + c.getStudentsGrade() +"\n";
        }
        return str;
    }
}
