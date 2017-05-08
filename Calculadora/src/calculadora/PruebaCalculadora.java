package calculadora;

import java.util.Scanner;

public class PruebaCalculadora {
    public static void main(String[] args) {
        
        int opcion;
        double x,y;
      
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Calculadora aritmetica basica");
        System.out.println("Ingresa la operación que desean realizar de acuerdo a las siguientes opciones: ");
        System.out.printf("Teclea 1 para realizar una suma%nTeclea 2 para realizar una resta%n"
                + "Teclea 3 para realizar una multiplicación%nTeclea 4 para realizar una división%n"
                + "Tu opción: ");
        opcion=entrada.nextInt();
        if(opcion<5){
            System.out.println("La opcion ingresada no es valida");
        System.out.println("Dame el primer numero: ");
        x=entrada.nextDouble();
        System.out.println("Dame el segundo numero: ");
         y=entrada.nextDouble();
        //Llama al metodo sumar
        Calculadora Cal=new Calculadora();
        if(opcion==1){
            
            Cal.sumar(x,y);
        }
        //Llama al metodo restar
        else if(opcion==2){
            
            Cal.calculadora(x,y);
            Cal.resta;
        }
        //Llama al metodo multiplicar
        else if(opcion==3){
            
            Cal.calculadora(x,y);
            Cal.multiplicar;
        }
        //Llama al metodo dividir
        else if(opcion==4){
            
            Cal.calculadora(x,y);
            Cal.dividir;
        }
        //Indica que la opcion ingresada no es valida
        
        }
    }
}
