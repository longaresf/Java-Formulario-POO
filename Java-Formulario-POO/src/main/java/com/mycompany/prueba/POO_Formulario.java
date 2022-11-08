/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;
import java.util.Scanner;
/**
 *
 * @author fco
 */
public class POO_Formulario {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String nombre;
        String apellido;
        String edad;
        String rut;

        System.out.println("Ingrese nombre");
        nombre = dato.nextLine();
        System.out.println("Ingrese apellido");
        apellido = dato.nextLine();
        System.out.println("Ingrese edad");
        edad = dato.nextLine();
        System.out.println("Ingrese Rut XXXXXXXX-X");
        rut = dato.nextLine();

        Persona persona1 = new Persona();

        boolean inputError = true;
        do {
            try {
                inputError = persona1.nombreValido(nombre);
                if (inputError) {
                    persona1.setNombre(nombre);
                } else if (inputError == false) {
                    nombre = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);

        do {
            try {
                inputError = persona1.apellidoValido(apellido);
                if (inputError) {
                    persona1.setApellido(apellido);
                } else if (inputError == false) {
                    apellido = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);

        do {
            try {
                inputError = persona1.edadValido(edad);
                if (inputError) {
                    persona1.setEdad(edad);
                } else if (inputError == false) {
                    edad = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);
        
                do {
            try {
                inputError = persona1.rutValido(rut);
                if (inputError) {
                    persona1.setRut(rut);
                } else if (inputError == false) {
                    rut = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);

        System.out.println("Validacion terminada");

        System.out.println(persona1);
    }
}
