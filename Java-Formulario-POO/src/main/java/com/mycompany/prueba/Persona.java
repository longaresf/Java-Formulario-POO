/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author fco
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String edad;
    private String rut;
    
    public Persona() {

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
        public static boolean nombreValido(String nombre) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}");
        Matcher mather = pattern.matcher(nombre);
        if (mather.find() == true) {
            System.out.println("Nombre válido");
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Nombre inválido, vuelva a escribir su Nombre");
            inputError = false;
        }
        return inputError;
    }

    public static boolean apellidoValido(String apellido) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}");
        Matcher mather = pattern.matcher(apellido);
        if (mather.find() == true) {
            System.out.println("Apellido válido");
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Apellido inválido, vuelva a escribir su Apellido");
            inputError = false;
        }
        return inputError;
    }
    
        public static boolean edadValido(String edad) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^[0-9]{2}$");
        Matcher mather = pattern.matcher(edad);
        if (mather.find() == true) {
            System.out.println("Edad válida");
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Edad inválida, vuelva a escribir su edad");
            inputError = false;
        }
        return inputError;
    }

    public static boolean rutValido(String rut) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^[0-9.]+-[0-9kK]{1}$");
        Matcher mather = pattern.matcher(rut);
        if (mather.find() == true) {
            System.out.println("Rut válido");
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Rut inválido, vuelva a escribir su Rut");
            inputError = false;
        }

        return inputError;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", Apellido: "+apellido+", Edad: "+edad+", Rut: "+rut;

    }
}
