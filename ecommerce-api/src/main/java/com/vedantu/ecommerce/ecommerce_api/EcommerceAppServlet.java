package com.vedantu.ecommerce.ecommerce_api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class EcommerceAppServlet extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public EcommerceAppServlet() {
		singletons.add(new OrderController());
		
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
