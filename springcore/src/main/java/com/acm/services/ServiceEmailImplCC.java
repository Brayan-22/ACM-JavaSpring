package com.acm.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("servicioEmailCC")
public class ServiceEmailImplCC implements IServiceEmail{

    @Override
    public void sendEmails() {
        System.out.println("Envio masivo de correos utilizando copias de carbon");
    }
}
