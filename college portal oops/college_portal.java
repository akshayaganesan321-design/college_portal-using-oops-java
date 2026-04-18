import java.util.*;
class student{
    String name;
    int id;
    String collegeName;
    String Dept;
    int age;

student(){}
student( String name ,int id, String collegeName , String Dept ,int age){
    this.name=name;
    this.id=id;
    this.collegeName=collegeName;
    this.Dept=Dept;
    this.age=age;
}
void show(){ 
     System.out.println("name: "+name);
     System.out.println("id: "+id);
     System.out.println("college name: "+collegeName);
     System.out.println("department: "+Dept);
     System.out.println("age: "+age);
}
}
public class college_portal{
public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Student Information database");
  System.out.println("Enter the number of students: ");
  int n =scan.nextInt();

  student[] s1=new student[n];
  
  for(int i=0;i<n;i++){
  System.out.println("Enter the students details: " +(i+1));
            System.out.print("Name: ");
            String name = scan.nextLine();

            System.out.print("ID: ");
            int id = scan.nextInt();
            scan.nextLine();
System.out.print("College Name: prince dr.k vasudevan engineering college of technology");
            String collegeName = scan.nextLine();

            System.out.print("Department: ");
            String Dept = scan.nextLine();

            System.out.print("Age: ");
            int age = scan.nextInt();
            scan.nextLine();
  s1[i]=new student(name,id,collegeName,Dept,age);
}
  for(int i=0;i<n;i++){
  s1[i].show();
}
}
}