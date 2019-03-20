package com.vedantu.ecommerce.ecommerce_api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vedantu.ecommerce.data.OrderRequest;
import com.vedantu.ecommerce.data.OrderResponse;
import com.vedantu.ecommerce.data.ServiceRequest;
import com.vedantu.ecommerce.data.ServiceResponse;
import com.vedantu.ecommerce.service.OrderService;

@Path("/order")
public class OrderController {
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrder(ServiceRequest<OrderRequest> serviceRequest) {
		
		ServiceResponse<OrderResponse> serviceResponse = new ServiceResponse<>();
		OrderRequest orderRequest=serviceRequest.getBody();
		OrderResponse orderResponse=OrderService.createOrder(orderRequest);
		if(orderResponse!=null) {
			serviceResponse.setData(orderResponse);
			serviceResponse.setMsg("Sucess");
			serviceResponse.setStatus(0);
		}
		else {
			serviceResponse.setMsg("Failure");
			serviceResponse.setStatus(1);
		}
		return Response.status(200).entity(serviceResponse).build();
	}

}
