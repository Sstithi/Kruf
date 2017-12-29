
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.*;
//import java.util.Scanner;

/**
 *
 * @author kruf
 */
public class Student extends User implements Serializable{
    int id;
    int password;
    String name;
    String dept;
    double cgpa;
    int Trisemester;
    String course;
    String routine;
    String assignment;
    String faculty;

    public Student(String name,int id, String dept,int Trisemester,int password,double cgpa,  String course,String routine) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
        this.Trisemester = Trisemester;
        this.course = course;
        this.routine=routine;
    }

    public Student() {
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
    /*
    void write(Student writeStu) throws Exception
    {
        File f=new File("student.txt");
         FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(writeStu);
        oos.close();
        
        
    }
    
     void deletStudent(int delstu) throws IOException, ClassNotFoundException
    {
        //delete srudent from file
        File f=new File("student.txt");
         FileInputStream fo = new FileInputStream(f);
        ObjectInputStream oos = new ObjectInputStream(fo);
        
        while(true){
       Student s1 = (Student) oos.readObject();
       if(s1.id==delstu )
       {
           oos.close();
       }
      
        
    }
    }
    */
    
   /* Student view(int view)
    {
        //read student file find view.id if matches than return to student frame
        return ;
    }*/

    String changePass(int oldPass,int newPass)
    {
        if(oldPass==this.getPass())
        {
            this.setPass(newPass);
            return("Password chaged successfully");
        }
        else 
        {
            return("wrong Password");
        }
        
        
        
        
        
    }
    
     
  /*  boolean checkStudent(int id,int pass) throws FileNotFoundException, IOException, ClassNotFoundException
        {
            File f=new File("student.txt");
         FileInputStream fo = new FileInputStream(f);
        ObjectInputStream oos = new ObjectInputStream(fo);
        Student s1=new Student();
        while (true){
        s1 = (Student) oos.readObject();
      // Scanner sc = new Scanner (f);
      if(s1.id==id )
      {
          if(s1.pass==pass )
          {
              oos.close();
          return true;
          }
      }
        }
        
        
        
        
        }*/
            
    public String toString()
    {
        
        return (""+name+ " "+id+ " "+ dept+" " + Trisemester + " "+password+" "+cgpa+" "+ course+ " "+ routine+" "+faculty);
    }

   /* 
    Student getclass(int id) throws Exception
    {
       File f=new File("student.txt");
         FileInputStream fo = new FileInputStream(f);
        ObjectInputStream oos = new ObjectInputStream(fo);
        
        while(true){
       Student s1 = (Student) oos.readObject();
       if(s1.id==id )
       {
           return s1;
       }
      
        
    }
    }
    */
    
    
    
}
