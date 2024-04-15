package com.acm;

import com.acm.models.Estudiante;
import com.acm.repository.Impl.EstudianteDAO;
import com.acm.services.IEstudianteService;
import com.acm.services.Impl.EstudianteServiceImpl;


public class App 
{
    public static void main( String... args )
    {
        IEstudianteService estudianteService = new EstudianteServiceImpl(new EstudianteDAO());
        estudianteService.createTable();
        
        estudianteService.registrar(new Estudiante(1, "Alejandro", "Riveros", "20000000"));
        estudianteService.registrar(new Estudiante(2, "Alejandro", "Riveros", "30000000"));
        System.out.println(estudianteService.cantidad());
        System.out.println(estudianteService.getAll());
        estudianteService.dropTable();
    }
}
