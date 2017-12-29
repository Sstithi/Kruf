
import java.io.*;
public class TransferData extends Student
{
	
	void write(Student writeStu) throws IOException 
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
	        
	        while(true)
	    {
	       Student s1 = (Student) oos.readObject();
	       if(s1.id==delstu )
	       {
	           oos.close();
	       }
	        
	        
	        
	    }
	      
	        
	    }
	        boolean checkStudent(int id,int pass) throws FileNotFoundException, IOException, ClassNotFoundException
	        {
	        File f=new File("student.txt");
	        FileInputStream fo = new FileInputStream(f);
	        ObjectInputStream oos = new ObjectInputStream(fo);
	        Student s1=new Student();
	        while (true)
	        {
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
	        }
	        
	        Student getclass(int id ) throws Exception
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
	        
    

         }
	    
