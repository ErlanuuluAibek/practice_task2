import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Aibek","Erlan uulu",18, "danyalider178@gmail.com","male",8);
        Student student2=new Student("\nAyana","Samat kyzy",18, "Ayana@gmail.com","female",7);
        Student student3=new Student("\nMirlan","",23, "Mirlan@gmail.com","male",6);
        Student student4=new Student("\nSezim","Mirbekova",20, "Sezim@gmail.com","female",8);
        Student student5=new Student("\nBegimai","Alieva",18, "Begimai@gmail.com","female",7);
        Student student6=new Student("\nEldiyar","Kylychbekov",19, "Eldiyar@gmail.com","male",9);
        Student student7=new Student("\nIlgiz","Monkulov",35, "Ilgiz@gmail.com","male",5);
        Student student8=new Student("\nNargigit","Kushtarov",32, "Nargigit@gmail.com","male",8);
        Student student9=new Student("\nAicholpon","Nujigit kyzy",17, "danyalider178@gmail.com","female",9);
        Student student10=new Student("\nSultan","Murzagulov",18, "Sultan@gmail.com","male",7);
        Student[]students=new Student[]{student,student2,student3,student4,student10,student6,student5,student7,student8,student9};
        School school=new School("M. Sudukov",students);
        System.out.println(school.findByName("Aibek"));
        System.out.println(Arrays.toString(school.getAllGirls()));
        System.out.println(school);
        System.out.println(school.getAverageEstimation());
        school.getAllStudents();
        school.getMaxEstimation();
        school.getAverageAge();
    }
}