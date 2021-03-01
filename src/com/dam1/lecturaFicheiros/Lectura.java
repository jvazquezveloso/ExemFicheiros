package com.dam1.lecturaFicheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lectura {
    public static void lerLiñas(){
        //File f = new File("/home/dam1a/Escritorio/numeros.txt");
        File f = new File("modulos.txt"); //dende o directorio raiz, o ficheiro esta na carpeta do proxecto
        String datos;
        Scanner sc = null;
        try {
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                datos = sc.nextLine();
                System.out.println(datos);
            }
        }catch(FileNotFoundException ex){
            System.out.println("erro lectura liña"+ ex.toString());
        }
        finally {
            sc.close();
        }
    }
    public static void lerString(){
        File f = new File("/home/dam1a/Escritorio/numeros.txt");
        //File f = new File("modulos.txt"); //dende o directorio raiz, o ficheiro esta na carpeta do proxecto
        String datos;
        Scanner sc = null;
        try {
            sc = new Scanner(f);
            while (sc.hasNext()){
                datos = sc.next();
                System.out.println(datos);
            }
        }catch(FileNotFoundException ex){
            System.out.println("erro lectura liña"+ ex.toString());
        }
        finally {
            sc.close();
        }
    }
    public static void lerStringUsandoDelimitadores() {
        File f = new File("/home/dam1a/Escritorio/nomes.txt");
        //File f = new File("modulos.txt"); //dende o directorio raiz, o ficheiro esta na carpeta do proxecto
        String datos;
        Scanner sc = null;
        try {
            sc = new Scanner(f).useDelimiter(","); //usa como separador ","
            sc = new Scanner(f).useDelimiter("\\s*,\\s*");
            while (sc.hasNext()) {
                datos = sc.next();
                System.out.println(datos);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lectura liña" + ex.toString());
        } finally {
            sc.close();
        }
    }
        public static ArrayList<Integer>lerEnteiros(File fich){ //recibo string nome File f = new File(nome+".txt")
            ArrayList<Integer> lista = new ArrayList<>();
            Scanner sc = null;
            int num;
            try {
                sc = new Scanner(fich);
                while (sc.hasNextInt()){
                    num=sc.nextInt();
                    lista.add(num);
                }
            }catch (FileNotFoundException ex){
                System.out.println("erro lerEnteiros "+ex.toString());
            }
            finally {
                sc.close();
            }
            return lista;
        }
        public static void lerAlumnado(String nomeFicheiro){
        File fich;
        Scanner sc= null;
        List<Alumno>lista = new ArrayList<Alumno>();
        fich = new File(nomeFicheiro+".txt");
        try{
            sc = new Scanner(fich).useDelimiter(",");
            while (sc.hasNextLine()){
                linea = sc.nextLine();
                String[]listaPersoa = linea.split(",");
                Alumno al = new Alumno(listaPersoa[0],Integer.parseInt(listaPersoa[l]),listaPersoa[2]);
                lista.add(al);
            }
        }catch (FileNotFoundException ex){
            System.out.println("erro lectura lerAlumnado"+ex.toString());
        }
        finally {
            sc.close();
        }
        for (int i=0<lista.size():i++)
            System.out.println(lista.get(i));
        }

}
