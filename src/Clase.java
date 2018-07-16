
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmorenoar
 */
public class Clase {
    
    public static void main(String[] args) throws IOException {
        
        int num = 5;
        double numero2 = 3.4;
        
        /*Cast en JAVA*/
        //Transformar un valor del tipo double a int
        int valorConvertido = (int) numero2;
        
        char le = 'A';
        
        String palabra;

        //Transformamos un valor del tipo char a String
        palabra = Character.toString(le);
        
        System.out.println(palabra);
        
        int num1=10,num2=8;
        
        //Utilizando una variable
        if(num1 == num2){
            System.out.println("Son numeros iguales");
        }else{
            System.out.println("Son numeros diferentes");
        }
        
        //Utilizando un valor
        if(5 == 3){
            System.out.println("Son numeros iguales");
        }else{
            System.out.println("Son numeros diferentes");
        }
        
        /*
        1 PASO - planteo que tengo que hacer(LO ENTIENDO)
        10 / 2
         0   5   ->Numero par
        
        12 / 2
         0   6 -> Numero par
        
        11 / 2 
         1   5 ->Numero impar
        13 / 2
         1    6
        */
        /*2 PASO - PIENSO PSEUDOLENGUAJE
        si(num / 2 da de rest 0) entonces
                   es par
        sino
                   es impar
        */
        /*3 PASO - CODIFICO*/
        int num_1 = 11;
        
        //Creo una variable que va a ser igual a la operación que hago en el if
        int resultado = num_1 % 2;
        
        /*Utilizar num_1 % 2 y resultado que contiene lo mismo
        a Java le es indiferente, el solo va a ver el mismo valor*/
        if((num_1 % 2) == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        if(resultado == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        
        int numeroUno = 5;
        int numeroDos = 3;
        
        if(numeroUno < numeroDos){
            System.out.println("El numero: " + numeroDos + " es mas pequeño");
        }else{
            System.out.println("El numero: " + numeroUno + "es más grande");
        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String palabraBr;
        
        System.out.println("Introduce una palabra: ");
        palabraBr = br.readLine();

        System.out.println("El usuario a introducido: " + palabraBr);
        
        /*Forma 1 de convertir un String a int leyendo por teclado*/
        int edad;
        String lectura;
        System.out.println("Introduce tu edad:");
        lectura = br.readLine();
        edad = Integer.parseInt(lectura);
        
        /*Formar 2 de convertir un String a int leyendo por teclado
        System.out.println("Introduce el primer numero para sumar:");
        int numero =  Integer.parseInt(br.readLine());*/
        
        /*Leer un dato por teclado que introduce el usuario y convertirlo de String a Double
        System.out.println("Introduce el segundo numero para sumar :");
        double valorDecimal = Double.parseDouble(br.readLine());*/
        
        
        /*Ejemplo de calculadora leyendo datos del usuario*/
        System.out.println("Introduce el primer numero para sumar:");
        int numSuma1 =  Integer.parseInt(br.readLine());
        
        System.out.println("Introduce el segundo numero para sumar:");
        int numSuma2 =  Integer.parseInt(br.readLine());
        
        if(numSuma2 < 8){
            System.out.println("El numero es mas pequeños");
        }else{
            System.out.println("El numero es mas grande");
            int SumaTotal = numSuma2 + 3;
        }
        
        //Forma 1
        int resultadoSuma = numSuma1 + numSuma2;
        System.out.println("La suma es:" + resultadoSuma);
        
        //Forma 2
        System.out.println("La suma de los numeros: " + numSuma1 + " y " + numSuma2 + " es " + (numSuma1 + numSuma2));
        
        int resultadoMult = numSuma1 * numSuma2;
        System.out.println("La multiplicacion es: " + resultadoMult);
        
    }

}
