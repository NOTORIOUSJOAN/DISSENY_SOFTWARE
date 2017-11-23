package Time_Tracker;
import java.io.Serializable;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

//observer class that manages the information of the time interval.
public class Interval implements Observer,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean first_date = false;
	protected Date initial_date;
	protected Date final_date;
	Task father;
	
	
	public Interval(Task task,Chronometer chrono) {
		
		this.initial_date = new Date();
		this.final_date = new Date();
		chrono.addObserver(this);
		this.father=task;
		
	
	}
	
	
	public void stop(Chronometer chrono) {
		
		chrono.deleteObserver(this);
		
	}

	//Gets the newdate recieved from Chronometer and prints the information table.
	public void update(Observable arg0, Object s) {
		// TODO Auto-generated method stub
		
		this.final_date.setTime(((Date) s).getTime());
		this.father.update(final_date); 	
		
		
		System.out.println("Nom    Temps inici                         Temps final              Durada(hh:mm:ss)");
		System.out.println("----+-----------------------------+-------------------------------+------------------+");
		System.out.println(father.getFather().getName() + "    " + father.getFather().getInitial_date() + "    "+ father.getFather().getFinal_date() + "    "+ "00:00:"+father.getFather().getDuration());
		System.out.println(father.getName() + "    " + father.getInitial_date() + "    " + father.getFinal_date() +"    " + "00:00:"+father.getDuration());
	}
	

	/** 
	 * @uml.property name="tasks"
	 * @uml.associationEnd inverse="intervals:Time_Tracker.Task"
	 */
	private Task tasks;


	/** 
	 * Getter of the property <tt>tasks</tt>
	 * @return  Returns the tasks.
	 * @uml.property  name="tasks"
	 */
	public Task getTasks() {
		return tasks;
	}

	/** 
	 * Setter of the property <tt>tasks</tt>
	 * @param tasks  The tasks to set.
	 * @uml.property  name="tasks"
	 */
	public void setTasks(Task tasks) {
		this.tasks = tasks;
	}

	/** 
	 * @uml.property name="task"
	 * @uml.associationEnd multiplicity="(1 1)" aggregation="composite" inverse="interval:Time_Tracker.Task"
	 */
	
	/** 
	 * Getter of the property <tt>task</tt>
	 * @return  Returns the task.
	 * @uml.property  name="task"
	 */


	/** 
	 * Setter of the property <tt>task</tt>
	 * @param task  The task to set.
	 * @uml.property  name="task"
	 */


	/**
	 * @uml.property  name="task1"
	 * @uml.associationEnd  aggregation="composite" inverse="interval1:Time_Tracker.Task"
	 */



	/**
	 * Getter of the property <tt>task1</tt>
	 * @return  Returns the task1.
	 * @uml.property  name="task1"
	 */
	

	/**
	 * Setter of the property <tt>task1</tt>
	 * @param task1  The task1 to set.
	 * @uml.property  name="task1"
	 */
	 public void accept(Visitor v) {
		    v.visitInterval(this);
		  }


}
