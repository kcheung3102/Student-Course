public class Course {
    private String courseName;
    private String courseInfo;
    private String studentsGrade;

    public Course(){}

    public Course(String courseName, String courseInfo, String studentsGrade) {
        this.courseName = courseName;
        this.courseInfo = courseInfo;
        this.studentsGrade = studentsGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }

    public String getStudentsGrade() {
        return studentsGrade;
    }

    public void setStudentsGrade(String studentsGrade) {
        this.studentsGrade = studentsGrade;
    }

}
