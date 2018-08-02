package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {

	public static void main(String[] args) {
		//Referencing Employee
		Employee employee1,employee2,employee3;
		
		//fetching object from file employee.ser
		//Deserialization
		try (FileInputStream fileInputStream = new FileInputStream("employee.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);){
			employee1 = (Employee) objectInputStream.readObject();
			employee2 = (Employee) objectInputStream.readObject();
			employee3 = (Employee) objectInputStream.readObject();
		
			//printing employee details
			System.out.println(employee1);
			System.out.println(employee2);
			System.out.println(employee3);
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
