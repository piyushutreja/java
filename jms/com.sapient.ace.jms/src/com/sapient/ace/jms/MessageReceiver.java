package com.sapient.ace.jms;

import javax.jms.JMSException;
//import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MessageReceiver {
	
	private static int REMAINING_QUANTITY =30;
	
	public static void main(String[] args) {
		try {
			readTextQueue("dynamicQueues/OrderQueue4Ace");
			//sendtoExecutedOrderQueue("dynamicQueues/ExecutedOrderQueue4Ace")
			//readTextQueue("dynamicQueues/ExecutedOrderQueue4Ace");
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	private static void readTextQueue(String queueName) throws JMSException {
		
		QueueConnection con = null;
		QueueSession session = null;
		QueueReceiver receiver = null;
		
		try {
			InitialContext context = new InitialContext();
			QueueConnectionFactory factory = (QueueConnectionFactory) context
					.lookup("QueueConnectionFactory");
			Queue queue = (Queue) context.lookup(queueName);
			con = factory.createQueueConnection();
			session = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			receiver = session.createReceiver(queue);
			// The second argument of the method is a boolean expression that
			// define a message selector.
			// receiver = session.createReceiver(queue, "count = 2");
			con.start();
			while (true) {
				// Blocking call. Wait until message is available on the queue.
				ObjectMessage message = (ObjectMessage) receiver.receive();
				// Wait for 1 millisecond
				// receiver.receive(1);
				// Non Blocking call. Read a message only if a message is
				// present on the queue
				// receiver.receiveNoWait();
				////TextMessage textMessage = (TextMessage) message;
				////System.out.println(textMessage.getText());
				Order order =(Order) message.getObject();
				//Order order = (Order) receiver.receive();
				if (order.getQuantity() < REMAINING_QUANTITY){
				sendtoExecutedOrderQueue("dynamicQueues/ExecutedOrderQueue4Ace");
				}
				else{
					
			}
		} 
		}catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			receiver.close();
			session.close();
			con.close();
		}
	
	
	}


	private static void sendtoExecutedOrderQueue(String string) throws JMSException {
		
		try {
		InitialContext context = new InitialContext();
		
		QueueConnectionFactory factory =  (QueueConnectionFactory) context.lookup("QueueConnectionFactory");
		//Queue queue = (Queue) context.lookup("dynamicQueues/OrderQueue4Ace");
		Queue queue1 = (Queue) context.lookup("dynamicQueues/ExecutedOrderQueue4Ace");
		QueueConnection con = factory.createQueueConnection();
		QueueSession session = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		//QueueSender sender = session.createSender(queue);
		QueueSender sender = session.createSender(queue1);
		
		TextMessage message = session.createTextMessage();
		sender.send(message);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
