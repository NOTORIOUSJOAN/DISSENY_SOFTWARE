package altres;
import java.util.Observable;
import java.util.Observer;

public class Printer implements Visitor,Observer {
	
	Chronometer chrono1 = new Chronometer();

	public Printer(){
		
		chrono1.addObserver(this);
		
	}
	public void update(Observable arg0, Object s) {
		
		
	}


	public void visitTask(Task task) {
		// TODO Auto-generated method stub
		if(task.getName() != null){
			long aux = task.getDuration();
			System.out.println(task.getName() + "   " + task.getInitial_date() + "  " + task.getFinal_date() + "   " + aux );
		}
		else System.out.println(task.getName());
	}

	public void visitProject(Project project) {
		// TODO Auto-generated method stub
		if(project.getName() != null){
			long aux = project.GetDuration();
			System.out.println(project.getName() + "   " + project.getInitial_date() + "  " + project.getFinal_date() + "   " + aux );
			
		}
		else System.out.println(project.getName());
		for(Activity sonActivity : project.getActivity()){
			project.accept(this);
		}
	}
	


	
	
}
