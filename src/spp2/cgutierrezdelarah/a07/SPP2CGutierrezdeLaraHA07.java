/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.a07;
import java.util.Scanner;

/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Long [] directorio = new Long [10];
    for (int i=0; i<directorio. length; i++){
        directorio [i] = tel("el numero telefonico "+ (i+1));
    }
    
    int consulta = consult("El numero que desea consultar");
    System.out.println("El numero de la persona "+consulta+" es: " + directorio[consulta]);
    }
    
    public static long tel(String mensaje){
        Scanner sc = new Scanner (System.in);
        long varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduce " + mensaje);
        try{
        varEntera = sc.nextLong();
        flag=false;
        }
        catch (Exception ex){
            System.out.println("Por favor introduce un numero valido");
            flag=true;
            sc.next();
        } 
        }while (flag); 
    return varEntera;
    }
    public static int consult(String mensaje){
        Scanner sc = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduce " + mensaje);
        try{
        varEntera = sc.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            sc.nextLine();
    } 
  } while (flag); 
    return varEntera;}
}
    
    

