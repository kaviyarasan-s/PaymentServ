package com.chainsys.paymentserv.impl;

import java.math.BigDecimal;
import java.util.Map;

import com.chainsys.csbank.model.Payee;
import com.chainsys.extension.PaymentGatewayImpl;
import com.chainsys.paymentserv.IPaymentServ;

public class PaymentServImpl implements IPaymentServ {

	public Map<String, String> doPayment(Payee payee) {
		 

		// Call executepayment

		PaymentGatewayImpl paymentGatewayImpl = new PaymentGatewayImpl();
		Payee payee2 = new Payee();
		payee2.setAccountnumber(620410100004L);
		payee2.setPayee_accountnumber(620410100000L);
		payee2.setPayee_name("test");
		payee2.setAmount(BigDecimal.valueOf(100));
		payee2.setPayee_ifsc("ATEK000138");
		Map<String, String> transactionStatus = paymentGatewayImpl.executePayment(payee2);

		System.out.println(" transaction status : "+ transactionStatus);
		
		return transactionStatus;
	} 
	 
	public static void main(String[] args) {
		
		new PaymentServImpl().doPayment(new Payee());
	}
}
