import java.util.Arrays;

public class School implements Service{
    private String schoolName;
    private Student[] students;


    public School(String schoolName, Student[] students) {
        this.schoolName = schoolName;
        this.students = students;

    }
    @Override
    public String findByName(String studentName){
        for (int i = 0; i < students.length; i++) {
            if(studentName.equals(students[i].getName())) {
                return studentName;
            }
        }
        return "net takogo imeni";

    }

    @Override
    public void getAllStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName());
        }
    }

    @Override
    public Student[] getAllGirls() {
        Student[]students1=new Student[10];
        int san=0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getGender().equals("female")){
                students1[san]=students[i];
                san++;
            }
        }
        return students1 ;
    }

    @Override
    public void getMaxEstimation() {
        int san=0;
        for (int i = 0; i < students.length; i++) {
            if(san<students[i].getEstimation()){
                san=students[i].getEstimation();
            }
        }
        System.out.print("Макс балл:");
        System.out.println(san);
    }

    @Override
    public double getAverageEstimation() {
        double san=0;
        double arif;
        for (int i = 0; i < students.length; i++) {
            san+=students[i].getEstimation();
        }
        arif=san/ students.length;
        return arif;
    }

    @Override
    public void getAverageAge() {
        int san=0;
        for (int i = 0; i < students.length; i++) {
            san+=students[i].getAge();
        }
        System.out.print("Средний возраст:");
        System.out.println(san/students.length);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School " +
                " schoolName: " + schoolName +
                " students: " + Arrays.toString(students);
    }

}
