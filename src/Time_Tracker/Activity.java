package Time_Tracker;

import java.io.Serializable;
import java.util.Date;

//Abstract class which contains projects and tasks.
public abstract class Activity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 
	 * @uml.property name="project"
	 * @uml.associationEnd inverse="activity:Time_Tracker.Project"
	 * @uml.association name="Projects"
	 */
	protected Project project;
	protected String name;
	protected String description;
	protected Date final_date;
	protected Date initial_date;
	protected long duration;
	protected Project father;
	
	//Activity will be the base class of project and task. It will share the following atributes.
	public Activity(String name, String description){
		
		this.setName(name);
		this.setDescription(description);
		this.setInitial_date(new Date());
		
		
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

	/** 
	 * Getter of the property <tt>project</tt>
	 * @return  Returns the project.
	 * @uml.property  name="project"
	 */
	

	/** 
	 * Setter of the property <tt>project</tt>
	 * @param project  The project to set.
	 * @uml.property  name="project"
	 */
	

	/**
	 * @uml.property  name="Name"
	 */
	

	/**
	 * Getter of the property <tt>Name</tt>
	 * @return  Returns the name.
	 * @uml.property  name="Name"
	 */
	

	/**
	 * Setter of the property <tt>Name</tt>
	 * @param Name  The name to set.
	 * @uml.property  name="Name"
	 */
	

	/**
	 * @uml.property  name="Description"
	 */
	

	/**
	 * Getter of the property <tt>Description</tt>
	 * @return  Returns the description.
	 * @uml.property  name="Description"
	 */
	
	/**
	 * Setter of the property <tt>Description</tt>
	 * @param Description  The description to set.
	 * @uml.property  name="Description"
	 */
	

	/**
	 * @uml.property  name="Initial_date"
	 */
	

	/**
	 * Getter of the property <tt>Initial_date</tt>
	 * @return  Returns the initial_date.
	 * @uml.property  name="Initial_date"
	 */
	
	/**
	 * Setter of the property <tt>Initial_date</tt>
	 * @param Initial_date  The initial_date to set.
	 * @uml.property  name="Initial_date"
	 */
	

	/**
	 * @uml.property  name="Final_date"
	 */
	

	/**
	 * Getter of the property <tt>Final_date</tt>
	 * @return  Returns the final_date.
	 * @uml.property  name="Final_date"
	 */
	

	/**
	 * Setter of the property <tt>Final_date</tt>
	 * @param Final_date  The final_date to set.
	 * @uml.property  name="Final_date"
	 */
	

	/** 
	 * @uml.property name="Duration"
	 */
	

	/** 
	 * Getter of the property <tt>Duration</tt>
	 * @return  Returns the duration.
	 * @uml.property  name="Duration"
	 */
	

	/** 
	 * Getter of the property <tt>project</tt>
	 * @return  Returns the project.
	 * @uml.property  name="project"
	 */
	
	
	public void setProject(Project project) {
		this.project = project;
	}
	
	public Project getProject() {
		return project;
	}
	
	
	
	/**
	 * Getter of the property <tt>Duration</tt>
	 * @return   Returns the duration.
	 * @uml.property   name="Duration"
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	
	public void setInitial_date(Date initial_date) {
		this.initial_date = initial_date;
	}
	
	public Date getInitial_date() {
		return initial_date;
	}
	
	
	public void setFinal_date(Date final_date) {
		this.final_date = final_date;
	}
	
	public Date getFinal_date() {
		return final_date;
	}
	
	
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
	public void setFather(Project father){
		
		this.father = father;
	}

	
	
	
	/** 
	 * @uml.property  name="project"
	 */
	
	
	
	public long getDuration() {
		return duration;
	}
	
	
	
	
	public Project getFather(){
		
		return father;
	}




		
		/**
		 */
		

}
