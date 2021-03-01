package com.escritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Escritura {
    public static void escribirNumeros(String nomeFich){
        File fi = new File(nomeFich+".txt");
        PrintWriter esc = null;
        try{
            esc = new PrintWriter(fi);
            esc.println(1);
            esc.println(2);
            esc.println(3);
            esc.println(4);

        }catch (FileNotFoundException ex){
            System.out.println("erro escribirNumeros"+ ex.toString());
        }finally {
            f.close();
        }
    }
    public File escribirFrases(String nomeFich, ArrayList<Integer>lista){
        PrintWriter f;
        File fich;
        fich= new File(nomeFich+".txt");
        try~
                f=new PrintWriter(fich);
        for (Integer num:lista)
            f.print(num+",");

    }catch (FileNotFoundException ex){
        System.out.println("erro 2"+ex.getMessage());
    }
    finally{
        f.close();
    }
    return fich;
}
