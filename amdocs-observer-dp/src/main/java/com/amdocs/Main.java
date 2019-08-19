package com.amdocs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaperWala paperwala=new PaperWala("Pune Paperwala");
		paperwala.addSubscriber(new Subscriber("Ramesh"));
		paperwala.addSubscriber(new Subscriber("Rishi"));
		paperwala.addSubscriber(new Subscriber("Abhay"));
		
		paperwala.notifyAllSubscribers("TOI");

	}

}
