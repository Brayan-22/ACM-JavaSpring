package com.acm.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("servicioEmailCCO")
public class ServiceEmailImplCCO implements IServiceEmail{

    @Override
    public void sendEmails() {
        System.out.println("Envio masivo de correos sin copia de carbon");
    }
    
}
