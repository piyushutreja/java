package com.sapient.ace.jms;

import java.util.Scanner;

import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;


public class MessageClient {
	
	private static final int THRESHOLD_QUANTITY=50;
	
	public static void main(String[] args) {
		
		try {
			
			InitialContext context = new InitialContext();
			QueueConnectionFactory factory =  (QueueConnectionFactory) context
					.lookup("QueueConnectionFactory");
			Queue queue = (Queue) context.lookup("dynamicQueues/OrderQueue4Ace");
			Queue queue1 = (Queue) context.lookup("dynamicQueues/ExecutedOrderQueue4Ace");
			QueueConnection con = factory.createQueueConnection();
			QueueSession session = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			QueueSender sender = session.createSender(queue);
			QueueSender sender1 = session.createSender(queue1);

			//TextMessage message = session.createTextMessage();
			//Scanner scanner = new Scanner(System.in);
			//for (int i = 0;; i++) {
				// We can set properties on a message. These properties are not
				// the part of message text. These properties can be used to
				// filter the messages at receiver end.
				//message.setIntProperty("count", i);
				//message.setText(scanner.nextLine());
				//sender.send(message);
				//sender1.send(message);
			//}
			
			//TextMessage message = session.createTextMessage();
			ObjectMessage message = session.createObjectMessage();
			
			Order order1 = new Order();
			order1.setOrderId(1);
			order1.setQuantity(10);
			order1.setDescription("Order1");
			order1.setPrice(50.50);
			
			if(order1.getQuantity() > 0 && order1.getQuantity()< THRESHOLD_QUANTITY && order1.getPrice() > 0){
				message.setObject(order1);
				sender.send(message);				
			}
			else{	
				
				throw new InvalidOrderException();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}