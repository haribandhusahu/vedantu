package com.vedantu.ecommerce.data;

public class ServiceRequest<T extends RequestBody> {
	private RequestHeader requestHeader;
	private RequestTrailer requestTrailer;
	private T body;
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(RequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}
	public RequestTrailer getRequestTrailer() {
		return requestTrailer;
	}
	public void setRequestTrailer(RequestTrailer requestTrailer) {
		this.requestTrailer = requestTrailer;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "ServiceRequest [requestHeader=" + requestHeader + ", requestTrailer=" + requestTrailer + ", body="
				+ body + "]";
	}
	
	
}
