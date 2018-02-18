package Designpattern.airpollution;

public class Subscriber implements Observer {
	
	private Subject subject = null;
	//private int observerId;
	private String name;
	private static int observerIdTrack =0;
	
	public Subscriber(String name,Subject subject) {
		this.subject = subject;
		this.subject.register(this);  // register itself into the list of observers
		this.name=name;
		//observerId = observerIdTrack++;
	}

	@Override
	public void update(String message) {
		System.out.println("subscriber " + name + " got notified: "+ message);
		
		
	}

	
}
