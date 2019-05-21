package com.chainsys.paymentserv;

import java.util.Map;

import com.chainsys.csbank.model.Payee;

public interface IPaymentServ {

	Map<String,String> doPayment(Payee payee);
	
}
