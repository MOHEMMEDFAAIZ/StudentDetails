/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/** distributed vcs - configure Local Rep
 * s1:initialize versioning, .gitconfig, .gitignore, commit
 *print student details 3 - name, age
 * user interaction i/o - view class
 * @author shaik
 */
public class PrintStudentdetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Student[] list = new Student[3]; //Array of object declaration
        // code to print 3 student details
        // Object student
        Student s1 = new Student();
        s1.setName("Faaiz");
        s1.setAge(20);
        Student s2 = new Student();
        s2.setName("Shahnawaz");
        s2.setAge(24);
        Student s3 = new Student();
        s3.setName("Azmina");
        s3.setAge(23);
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName()+ " " + list[i].getAge() );
        }
        }
}
