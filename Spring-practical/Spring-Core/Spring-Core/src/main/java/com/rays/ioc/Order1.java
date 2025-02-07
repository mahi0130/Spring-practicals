package com.rays.ioc;

public class Order1 {
	private Payment payment;
	private Inventory inventory;
	

		public void setPayment(Payment payment) {
			this.payment = payment;
		}

		
		public void setInventory(Inventory inventory) {
			this.inventory = inventory;
		}


		public void bookATicket(int items) {
			int price =10;
			double totalAmount = items*price;
			double updatedBalance = payment.makePayment(totalAmount);
			
			int updatedStock = inventory.sold(items);
			
			System.out.println("Tickets Are Booked");
			System.out.println("total amount paid ="+ totalAmount);
			System.out.println("remaing balance ="+ updatedBalance);
			System.out.println("updated stock = "+ updatedStock);
			
		}
}
