package com.programacion2;

import com.dam1.lecturaFicheiros.Lectura;
import com.escritura.Escritura;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //lemos liña completa
        //Lectura.lerLiñas();
        //lemos dato a dato
        //Lectura.lerString();
        /*File f = new File("/home/dam1a/numerosenteiros.txt");
        ArrayList<Integer> lista = Lectura.lerEnteiros(f);
        for (Integer ele:lista) {
            System.out.println(ele);
        }*/
        //Lectura.lerAlumnado("alumnos");
        //ESCRITURA NO FICHEIRO
        //escribir numeros
        Escritura.escribirNumeros("ficheironumeros");
    }
}
