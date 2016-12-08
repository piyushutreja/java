package com.sapient.ace.jms;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;

import javax.naming.InitialContext;
import javax.naming.NamingException;


public class JMSProducerConsumer {

	private ObjectMessage message;
	private Queue queue;
	private QueueConnection connection;
	private QueueSession session;
	private QueueSender sender;
	private QueueConnectionFactory factory;
	private final String QUEUE_FACTORY="QueueConnectionFactory";
	private InitialContext context;
	private QueueReceiver receiver;
	private List<ObjectMessage> messageList;
	private static final String EXECUTED_ORDER_QUEUE="dynamicQueues/ExecutedOrderQueue4Ace";
	private static int REMAINING_QUANTITY =30;
	
	public void sendMessageToQueue(String queueName,Order order){

		try {

			context = new InitialContext();
			factory =  (QueueConnectionFactory) context.lookup(QUEUE_FACTORY);
			queue = (Queue) context.lookup(queueName);
			connection = factory.createQueueConnection();
			session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			sender = session.createSender(queue);	
			message = session.createObjectMessage();
			message.setObject(order);
			System.out.println(message.getObject());
			sender.send(message);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public void readMessageFromQueue(String queueName) throws JMSException {
		
		
		try {
			
			context = new InitialContext();
			factory = (QueueConnectionFactory) context.lookup(QUEUE_FACTORY);
			queue = (Queue) context.lookup(queueName);
			connection = factory.createQueueConnection();
			session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			receiver = session.createReceiver(queue);
			connection.start();
			
			System.out.println("Starting listner for receiving messages");
			while (true) {
				// Blocking call. Wait until message is available on the queue.
				message = (ObjectMessage) receiver.receive();
				Order order = (Order)message.getObject();
				System.out.println(order.getQuantity());
				if (order.getQuantity() < REMAINING_QUANTITY)
				sendMessageToQueue(EXECUTED_ORDER_QUEUE,order);
				
				}
			
							 
		}catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			receiver.close();
			session.close();
			connection.close();
		}
	
			
	}
	
}