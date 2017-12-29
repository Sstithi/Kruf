
import java.io.*;
public class TestPerson {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
		Person p1 = new Person ("Furkan", 19);
		Person p2 = new Person ("Kruf",9);
		Person p3 = new Person ("Gadha", 100);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/Users/showm/Documents/Person.txt",true));
	// Write object in file
		
		out.writeObject(p1);
		out.writeObject(p2);
		out.writeObject(p3);
		
		
	// Read Object in file
		
		
		ObjectInputStream in = new ObjectInputStream (new FileInputStream("C:/Users/showm/Documents/Person.txt"));
		
		p1 = (Person) in.readObject();
		p2 = (Person) in.readObject();
		p3 = (Person) in.readObject();
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println();
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println();
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		
		
		 
		
	}
	

}
