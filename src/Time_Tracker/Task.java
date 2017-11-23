package Time_Tracker;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Collection;

//class that controls the intervals of all the projects.
public class Task extends Activity implements Serializable {

	protected List<Interval> interval_list = new ArrayList<Interval>();
	protected Collection<?> interval;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** 
	 * @uml.property name="interval"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="task:Time_Tracker.Interval"
	 */
	
	
	public Task(String Name, String Description, Project project) {
	
		super(Name, Description);
		this.setFather(project);
		project.addActivity(this);
	}
	//Returns the intervals of one task.
	public List<Interval> getIntervalList(){
		
		return interval_list;
		
	}
	//Updates the duration and the final date of some task.
	public void update(Date finalDate) {
		this.duration = this.duration + 2;
		this.final_date=finalDate;
		if(this.father!= null) {
			father.update(final_date);
		}
	}
	
	//Creates a new interval and add this interval in a list.
	public void createInterval(Chronometer chrono) {
		
		Interval interval = new Interval(this,chrono);
		interval_list.add(interval);
		
	}
	
	public void stop(Chronometer chrono) {
		
		Interval interval = this.getIntervalList().get(interval_list.size()-1);
		interval.stop(chrono);
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	
		
	
	/**
	 * @uml.property  name="interval"
	 * @uml.associationEnd  inverse="task:Time_Tracker.Interval"
	 */
	

	/** 
	 * @uml.property  name="interval"
	 * @uml.associationEnd  inverse="task:Time_Tracker.Interval"
	 */
	public Collection<?> getInterval() {
		return interval;
	}

	/** 
	 * Setter of the property <tt>interval</tt>
	 * @param interval  The interval to set.
	 * @uml.property  name="interval"
	 */
	public void setInterval(Collection<?> interval) {
		this.interval = interval;
	}

	/** 
	 * @uml.property name="intervals"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="composite" inverse="tasks:Time_Tracker.Interval"
	 */
	protected  Collection intervals;

	/** 
	 * Getter of the property <tt>intervals</tt>
	 * @return  Returns the intervals.
	 * @uml.property  name="intervals"
	 */
	public Collection getIntervals() {
		return intervals;
	}
	/**
	 * @uml.property  name="interval1"
	 * @uml.associationEnd  inverse="task1:Time_Tracker.Interval"
	 */

	/** 
	 * Setter of the property <tt>intervals</tt>
	 * @param intervals  The intervals to set.
	 * @uml.property  name="intervals"
	 */
	public void setIntervals(Collection intervals) {
		this.intervals = intervals;
	}
	
	 public void accept(Visitor v) {
		    v.visitTask(this);
		  }
	
}

	
	
