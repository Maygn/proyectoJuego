package proyecto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import proyecto2.controllers.AplicadorEquipo;
import proyecto2.controllers.CreacionPJ;
import proyecto2.models.Atributo;
import proyecto2.models.Personaje;
import proyecto2.models.movimientos.AtaqueEjemplo;
import proyecto2.models.movimientos.Realizable;
import proyecto2.utilities.AleatorioDescartando;


public class App 
{
    public static void main( String[] args )
    {
        Personaje p1=new Personaje();
       CreacionPJ.datosFijos(p1);
       CreacionPJ.datosVariables(p1);
       try {
		AplicadorEquipo.equipar(p1);
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
       
        
        p1.setAtaque(new Atributo(1000));
        p1.setDefensa(new Atributo(5000));
        p1.setVidaMaxima(new Atributo(20000));
        p1.setVivo(true);
        
        try {
			AplicadorEquipo.equipar(p1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//
//        p1.setVidaMaxima(new Atributo(200));
//        p1.setVidaActual(new Atributo(200));
//
//        System.out.println(p1.toString());
//
//        Realizable a1= new AtaqueEjemplo("Patada","Una patada",100,"Golpe");
//
//        System.out.println(a1.toString());
//
//        a1.realizar(p1, p1);
//
//        p1.getVidaActual().calcularFinal();
//
//
//        System.out.println(p1.toString());
        
        
      
        
        
        
        
        
 
        
        
        
        
        
//        
//        ArrayList<Integer> cosas = new ArrayList<Integer>(Arrays.asList(1,2));
//        
//        
//        AleatorioDescartando<Integer> ad1=new AleatorioDescartando<>(cosas);
//    	try {
//			System.out.println(ad1.prueba());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}
//    	
//    	System.out.println(p1.toString());
    	
    }
}
