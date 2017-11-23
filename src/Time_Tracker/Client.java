package Time_Tracker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Class that simulates the interaction with the client.

public class Client {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String Name = "P1";
		String Desc= "Descripcio del primer projecte";
		String Namep2 = "P2";
		String Descriptionp2 = "Descripcio del segon projecte";
		String NameTask1 = "T1";
		String DescTask1 = "Descripio tasca 1";
		String NameTask2 = "T2";
		String DescTask2 = "Descripio tasca 2";
		String NameTask3 = "T3";
		String DescTask3 = "Descripio tasca 3";	
		int delay = 2000;
		
		Chronometer crono = new Chronometer(delay);
		
		Project project = new Project(Name, Desc);
		
		Project project2 = new Project(Namep2, Descriptionp2, project);
		
		Task task3 = new Task(NameTask1, DescTask1, project);
		
		@SuppressWarnings("unused")
		Task task1 = new Task(NameTask2, DescTask2, project2);
		
		Task task2 = new Task(NameTask3, DescTask3, project2);
		
	
		task3.createInterval(crono);
		Thread.sleep(3000);
		
		task3.stop(crono);
		
		Thread.sleep(7000);
		
		task2.createInterval(crono);
		Thread.sleep(10000);
		task2.stop(crono);
		
		task3.createInterval(crono);
		Thread.sleep(3000);
		task3.stop(crono);
		
		System.out.println("Nom    Temps inici        Temps final        Durada(hh:mm:ss)");
		System.out.println("----+-----------------+------------------+------------------+");
		
		
	
		
		
		//Creates a file which saves the information of the object
		try {
			
			FileOutputStream fileOut = new FileOutputStream("timetracker.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(project);
			out.close();
			fileOut.close();
			System.out.println("Saved Correctly in C:/Users/Usuario/Desktop/");
			
			
		}catch (IOException i) {
			i.printStackTrace();
			System.out.println("No guarda");
			
		}
		project= null;
		
		
		//Load an object from the file
		try {
			 FileInputStream fileIn = new FileInputStream("timetracker.ser");
			 ObjectInputStream in = new ObjectInputStream(fileIn);
			 project = (Project) in.readObject();
			 
			 in.close();
			 fileIn.close();
			 
			 }catch(FileNotFoundException e) {
			  
			  System.out.println("FileNotFoundException");
			  
			 }catch(IOException i) {
			  
			  System.out.println("IOException");
			  
			 }catch(ClassNotFoundException i) {
			 }
		System.out.println("Nom    Temps inici        Temps final        Durada(hh:mm:ss)");
		System.out.println("----+-----------------+------------------+------------------+");
		System.out.println(project.getName() + "    " + project.getInitial_date() + "    " + project.getFinal_date() + "    " + project.GetDuration() + "    ");
	

		}
} 

