package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em1=new Employee(1,"himanshu",10000);
		Employee em2=new Employee(2,"rohit",10000);
		Employee em3=new Employee(3,"shubham",10000);

		//writing list to file employee.ser
		//Serialization
		try (FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
				objectOutputStream.writeObject(em1);
				objectOutputStream.writeObject(em2);
				objectOutputStream.writeObject(em3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
