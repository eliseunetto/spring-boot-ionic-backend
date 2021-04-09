package com.eliseunetto.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.eliseunetto.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
