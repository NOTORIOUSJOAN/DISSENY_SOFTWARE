package Time_Tracker;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

//Class which manage the subprojects and tasks of one project.
public class Project extends Activity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Array of projects or tasks where each project saves the subprojects and tasks it has.
	protected List<Activity> activity_list = new ArrayList<Activity>(); 
	
	//Constructor of root project.
	public Project(String name, String description){  
		super(name, description);
		this.father=null;
		
	}
	//Subprojects' constructor. They need the father project
	public Project (String Name, String Desc, Project project) { 
		
		super(Name, Desc);
		this.setFather(project);
		father.addActivity(this);
		
	}
	
	
	public void addActivity(Activity activity) {
		
		this.activity_list.add(activity);
		
	}
	
	
	public List<Activity> getActivity(){
		
		return this.activity_list;
	}
	
	
	public Date GetInitialDate() {
		
		return this.initial_date;
		
	}
	
	public Date GetFinalDate() {
		
		return this.final_date;
		
	}
	
	
	public long GetDuration() {
		
	
		return duration;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	//This function updates the duration, the last date and the father of some project.
	public void update(Date finalDate) {
		this.duration = this.duration + 2;
		this.final_date=finalDate;
		if(this.father!= null) {
			father.update(final_date);
		}
	}
	
	
	/** 
	 * @uml.property name="activity"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="project:Time_Tracker.Activity"
	 * @uml.association name="Projects"
	 */
	private Collection<?> activity;

	/** 
	 * Getter of the property <tt>activity</tt>
	 * @return  Returns the activity.
	 * @uml.property  name="activity"
	 */
	

	/** 
	 * Setter of the property <tt>activity</tt>
	 * @param activity  The activity to set.
	 * @uml.property  name="activity"
	 */
	public void setActivity(Collection<?> activity) {
		this.activity = activity;
	}
	
	 public void accept(Visitor v) {
		    v.visitProject(this);
		  }
	

		
		/**
		 */
		

}
