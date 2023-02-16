/**
 * 
 */
package com.signify.client;

import com.signify.service.PaymentService;

/**
 * @author Nivi
 *
 */
public class PaymentClient {
	public static void main (String[] args) {
		PaymentService service = new PaymentService();
		service.sendNotification();
		
	}

}
