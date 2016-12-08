package ayush.ace.day4.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialVersionUid {
	
	public static void main(String[] args) throws Exception{
	
	Employee emp = new Employee("Ayush", 25);
	

	FileOutputStream fout = new FileOutputStream("C://emp.ser");
	ObjectOutputStream objOut = new ObjectOutputStream(fout);
	
	//objOut.writeObject(emp);
	
	FileInputStream fin =  new FileInputStream("C://emp.ser");
	ObjectInputStream objIn = new ObjectInputStream(fin);
	
	Employee emp1 = (Employee)objIn.readObject();
	System.out.println(emp1.getAge() + " " + emp.getName());
	
	
	
	
	}

}


class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 25L;
	
	
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	int age;	
	
	Employee(String name, int age){
		
		this.name = name;
		this.age = age;
		
	}
	
	
}