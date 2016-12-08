package com.sapient.ace.jms;


import com.sapient.ace.jms.Exception.InvalidOrderException;
import com.sapient.ace.jms.utility.JMSOrderUtility;


public class MessageClient {
	
	private static final int THRESHOLD_QUANTITY = 50;
	private static final String ORDER_QUEUE = "dynamicQueues/OrderQueue4Ace";
	private static final int orderId=1;
	private static final int orderQuantity=10;
	private static final double orderPrice=50.50;
	private static final String orderStatus="INITIAL"; 
	private static final String orderDescription="ORDER";
	
			
	
	
	public static void main(String[] args) {
		
		try {
				
			JMSProducerConsumer producer = new JMSProducerConsumer();
			JMSOrderUtility utility  = new JMSOrderUtility();
			Order order = utility.createOrder(orderId, orderQuantity, orderPrice, orderDescription, orderStatus);
			
						
			if(order.getQuantity() > 0 && order.getQuantity()< THRESHOLD_QUANTITY && order.getPrice() > 0){
				System.out.println("Sending Message");
				producer.sendMessageToQueue(ORDER_QUEUE,order);
			}
			else{	
				
				throw new InvalidOrderException();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}