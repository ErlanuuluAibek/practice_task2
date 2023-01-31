public interface Service {
    Student findByName(String studentName);
    void getAllStudents();
    Student[] getAllGirls();
    void getMaxEstimation();
    double getAverageEstimation();
    void getAverageAge();
}
