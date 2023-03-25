package main;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintMessageFormat {
	 public static void main(String[] args) {
		
		 ExecutorService es = Executors.newFixedThreadPool(3);
		 
		 Scanner sc = new Scanner(System.in);
		 Print printObj = new Print();
		 String s = sc.nextLine();
		 try {
			 es.execute(() -> {
				 try {
					 printObj.print("[-----");
				 }catch(Exception e) {
					 
				 }
			 });
			 es.execute(() -> {
				 try {
					 printObj.print(s);
				 }catch(Exception e) {
					 
				 }
			 });
			 es.execute(() -> {
				 try {
					 printObj.print("-----]");
				 }catch(Exception e) {
					 
				 }
			 });
			 es.shutdown();
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 sc.close();
		 }
	}
}

class Print{
	synchronized public void print(String s) {
		System.out.print(s);
	}
}
