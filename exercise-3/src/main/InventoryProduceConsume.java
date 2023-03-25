package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author Kamalesh
 *
 */
public class InventoryProduceConsume {
	
	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(2);
		
		Inventory inventory = new Inventory();
		
		
		es.execute(() -> {
			int i = 0;
			Thread.currentThread().setName("Producer");
			while(i++ < 50) {
				inventory.addProduct();
			}
		});
		
		es.execute(() -> {
			int j = 0;
			Thread.currentThread().setName("Consumer");
			while(j++ < 50) {
				inventory.consumeProduct();
			}
		});
		
		es.close();
		
	}

}
class Inventory{
	int product;
	
	synchronized public void addProduct() {
		if(product == 0) {
			product++;
			System.out.println(Thread.currentThread().getName() + " enters the inventory and adds a product.Product ==> " + product);
			notify();
		}
		try {
			wait();
		}catch(Exception e) {
			
		}
	}
	
	synchronized public void consumeProduct() {
		if(product != 0) {
			product--;
			System.out.println(Thread.currentThread().getName() + " enters the inventory and consumes a product.Product ==> " + product);
			notify();
		}
		try {
			wait();
		}catch(Exception e) {
			
		}
	}
}