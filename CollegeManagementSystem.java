class CollegeMember {
    String name;
    int id;

}
class student extends CollegeMember{
    String course;
    student(String name,int id,String course){
        this.name=name;
        this.id=id;
        this.course=course;
    }
    void displayDetails(){
        System.out.println("student Name:"+name);
        System.out.println("student ID:"+id);
        System.out.println("course:"+course);
    }
}
class faculty extends CollegeMember{
    String subject;
    faculty(String name,int id,String subject){
        this.name=name;
        this.id=id;
        this.subject=subject;
    }
    void displayDetails(){
        System.out.println("faculty Name:"+name);
        System.out.println("faculty ID:"+id);
        System.out.println("subject:"+subject);
    }
}
public class CollegeManagementSystem{
    public static void main(String[] args){
        student s=new student("Divya",101,"computer science");
        faculty f=new faculty("Lucky",201,"java programming");
        s.displayDetails();
        System.out.println();
        f.displayDetails();
    }
}
