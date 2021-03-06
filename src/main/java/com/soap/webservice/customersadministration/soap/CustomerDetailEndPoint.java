package com.soap.webservice.customersadministration.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.hubertsosa.CustomerDetail;
import br.com.hubertsosa.GetCustomerDetailRequest;
import br.com.hubertsosa.GetCustomerDetailResponse;

@Endpoint
public class CustomerDetailEndPoint {

	@PayloadRoot(namespace="http://hubertsosa.com.br", localPart = "GetCustomerDetailRequest")
	@ResponsePayload
	public GetCustomerDetailResponse processCustomerDetailRequest(@RequestPayload GetCustomerDetailRequest req) {
		GetCustomerDetailResponse response = new GetCustomerDetailResponse();
		CustomerDetail customerDetail = new CustomerDetail();
		customerDetail.setId(1);
		customerDetail.setName("Bob");
		customerDetail.setEmail("bob@gmail.com");
		customerDetail.setPhone("99999999");
		response.setCustomerDetail(customerDetail);
		return response;
	}
}
