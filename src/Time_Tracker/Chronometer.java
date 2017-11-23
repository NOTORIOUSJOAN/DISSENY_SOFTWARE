package Time_Tracker;

import java.io.Serializable;
import java.util.Date;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

//Class who control the time and notify the observers.
public class Chronometer extends Observable implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Chronometer(int delay){
		
		Timer timer = new Timer();
		//Creates a TimerTask and executes his run() depending on the delay value
		timer.scheduleAtFixedRate(timerTask, 0, delay); 
	}
	
	TimerTask timerTask = new TimerTask() {
		public void run() {
			
	
			setChanged(); 
			//Notifies the observers.
			notifyObservers(new Date()); 
			
			
			
		}
		
	};

}
