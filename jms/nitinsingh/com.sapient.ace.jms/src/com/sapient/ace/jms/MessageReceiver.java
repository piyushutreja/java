package com.sapient.ace.jms;

import java.util.ArrayList;
import java.util.List;

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

import com.sapient.ace.jms.Exception.InvalidOrderException;
import com.sapient.ace.jms.utility.JMSOrderUtility;

public class MessageReceiver {
	
	private static final String ORDER_QUEUE = "dynamicQueues/OrderQueue4Ace";

	
	public static void main(String[] args) {
		
		
		JMSProducerConsumer producer = new JMSProducerConsumer();
		System.out.println("Started receiving Message");
			try {
				producer.readMessageFromQueue(ORDER_QUEUE);
				System.out.println("after readMessageFRomQueue");		
				
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}

}
