package com.sapient.ace.jms.utility;

import java.io.Serializable;

import com.sapient.ace.jms.Order;

public class JMSOrderUtility implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3657603974839236811L;

	public Order createOrder(int orderId, int orderQuantity,double orderPrice,String orderDescription,String orderStatus){
		
		Order order = new Order();
		order.setOrderId(orderId);
		order.setPrice(orderPrice);
		order.setDescription(orderDescription);
		order.setQuantity(orderQuantity);
		order.setStatus(orderStatus);
				
		
		return order;
		
	}

}
