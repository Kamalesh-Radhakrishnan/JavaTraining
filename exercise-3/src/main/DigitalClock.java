package main;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock {
	
	LocalTime time = LocalTime.now();
	int second = time.getSecond();
	int minute = time.getMinute();
	int hour = time.getHour();
	
	synchronized public void seconds() {
		try {
			wait(1000);
			System.out.println(hour+":"+minute+":"+second);
			if(second == 59) {
				notifyAll();
			}else {
				second++;
			}
		}catch(Exception e) {
			
		}
	}
	synchronized public void minutes() {
		try {
			wait();
			if(second == 59) {
				second = 0;
				minute += 1;
			}
		}catch(Exception e) {
			
		}
	}
	
	synchronized public void hours() {
		try {
			wait();
			if(minute == 60) {
				minute = 0;
				if(hour == 23) {
					hour = 0;
				}else {
					hour++;
				}
			}
		}catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(3);
		DigitalClockPractice dcp = new DigitalClockPractice();
		es.execute(() -> {
			while(true) {
				dcp.seconds();
			}
		});
		es.execute(() -> {
			while(true) {
				dcp.minutes();
			}
		});
		es.execute(() -> {
			while(true) {
				dcp.hours();
			}
		});
		es.shutdown();
		es.close();
	}
	
}
