package com.acm.securityprueba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity security) throws Exception{
        return security
        .authorizeHttpRequests(x->{
            x.requestMatchers("api/prueba").permitAll().anyRequest().authenticated();
        })
        .formLogin(permisos->{
            permisos.successHandler(successHandler()).permitAll();//redireccion al completar el formularios
        })
        .sessionManagement(policy->{
            policy.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
            .sessionFixation(fixation->{
                fixation.migrateSession(); // Si se detecta el ataque, spring genera otros sessionID, sin perder la info de cookies y atributos
                // fixation.newSession(); //Sesion nueva, sin migrar datos
                // fixation.none(); //Inhabilita la seguridad
            })
            .invalidSessionUrl("/login")
            .maximumSessions(1)
            .expiredUrl("/login")
            .sessionRegistry(sessionRegistry());
        })
        .httpBasic(x->{
        })
        .build();
    }

    @Bean
    public SessionRegistry sessionRegistry(){
        return new SessionRegistryImpl();
    }

    public AuthenticationSuccessHandler successHandler(){
        return ((req,resp,auth)->{
            resp.sendRedirect("api/prueba");
        });
    }
}
