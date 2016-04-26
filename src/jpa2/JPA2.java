/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Álvaro Rios
 */

public class JPA2 {
private String nombre;
    /**
     * @param args the command line arguments
     */
@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    boolean opcion2 = false;
    
        // TODO code application logic here
        do {
        System.out.println("1. Crear Registro");
        System.out.println("2. Actualizar Registro");
        System.out.println("3. Crear Asociado"); 
        System.out.println("4. Buscar Asociado");
        System.out.println("Ingrese opcion:");
        Scanner e = new Scanner(System.in);
        Integer opcion = e.nextInt();
        JPA2 jpa2 = new JPA2();
            
        switch (opcion) {
	 case 1:
        System.out.println("Ingrese Asociado :");
        Scanner g = new Scanner(System.in);
        String asociado = g.next();
        jpa2.setNombre(asociado); 
         Asociado.insert(asociado);
         break;
        case 2:
        System.out.println("Ingrese Asociado a Buscar:");
        Scanner h = new Scanner(System.in);
        String asoci = h.next();
        Asociado.buscar(asoci);
        break;
        case 3:
        System.out.println("Ingrese Fecha:");
        Scanner j = new Scanner(System.in);
        String fecha = j.next();
        String nombre = jpa2.getNombre();
        Registradora.insertarRegistro(nombre,fecha);
        case 4:
            
        }
        System.out.println("Desea hacer alguna otra operacion?");
			System.out.println("1. Si");
			System.out.println("2. No");
        }while (opcion2); 
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
