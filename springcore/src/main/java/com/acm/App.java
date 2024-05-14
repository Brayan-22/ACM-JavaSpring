package com.acm;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acm.models.IUsuario;
import com.acm.models.Usuario;
import com.acm.models.UsuarioAnotation;
import com.acm.persistencia.IPersistenciaUsuario;
import com.acm.persistencia.PersistenciaUsuario;
import com.acm.persistencia.PersistenciaUsuarioMYSQL;
import com.acm.services.IServiceEmail;
import com.acm.services.ServiceEmailImplCC;
import com.acm.services.ServiceEmailImplCCO;
import com.acm.services.ServiceUsuarios;

/**
 *
 */
@ComponentScan
public class App 
{
    @Autowired
    @Qualifier("servicioEmailCCO")
    private IServiceEmail email;

    public static void main( String[] args )
    {
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Usuario user = applicationContext.getBean(Usuario.class);
        System.out.println(user);
        IServiceEmail email = applicationContext.getBean(ServiceEmailImplCCO.class);
        email.sendEmails();
        ((ConfigurableApplicationContext)applicationContext).close();
    }
}
