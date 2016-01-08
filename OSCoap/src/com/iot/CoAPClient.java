package com.iot;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;

public class CoAPClient {
	
	public String getFib(String ipcoap, String num)
	{
		CoapClient coap = new CoapClient("coap://"+ipcoap+":5683/fibonacci?n="+num);
		CoapResponse res = coap.get();
		return res.getResponseText();
	}

}
