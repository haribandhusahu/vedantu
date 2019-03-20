package com.vedantu.ecommerce.service;

import com.vedantu.ecommerce.dao.impll.OrderImpl;
import com.vedantu.ecommerce.data.OrderRequest;
import com.vedantu.ecommerce.data.OrderResponse;

public class OrderService {
	public static OrderResponse createOrder(OrderRequest orderRequest) {
		OrderResponse orderResponse=null;
		String orderId=null;
		orderId=OrderImpl.createOrder(orderRequest);
		if(orderId!=null) {
			orderResponse=new OrderResponse();
			orderResponse.setId(orderId);
		}
		return orderResponse;
	}

}
