/*
Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.

	Setting the name of the thread. 
    */
public class ThreadQue1 {

	public static void main(String[] args) {
		Thread t1 = new Thread("Scooby");
		System.out.println(t1.getName());
		Thread t2 = new Thread("Shaggy");
		System.out.println(t2.getName());

	}
}