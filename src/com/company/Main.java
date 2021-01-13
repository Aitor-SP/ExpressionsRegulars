package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("santako.txt");
        Scanner input = new Scanner(archivo);

        // Regular Expressions
        Pattern pareNoel = Pattern.compile("\\*<]:-DOo");
        Pattern rens = Pattern.compile(">:o\\)");
        Pattern follets = Pattern.compile("[^\\*]<]:-D");

        System.out.println("Con Regulars Expressions");
        while(input.hasNextLine()) {
            String linea = input.nextLine();

            Matcher n = pareNoel.matcher(linea);
            Matcher r = rens.matcher(linea);
            Matcher f = follets.matcher(linea);

            int nc = 0;
            int rc = 0;
            int fc = 0;

            while (n.find()){
                nc++;
            }
            while (r.find()){
                rc++;
            }
            while (f.find()){
                fc++;
            }

            System.out.print(nc > 0 ? "Pare Noel (" + nc + ") ":"");
            System.out.print(rc > 0 ? "Ren (" + rc + ") ":"");
            System.out.println(fc > 0 ? "Follet (" + fc + ") ":"");
        }

        // Sin Regular Expressions
        System.out.println();
        System.out.println("Sin Regulars Expressions --> DESCOMENTAR");

//        while (input.hasNextLine()){
//            String linea = input.nextLine();
//            String linea2;
//            int index = 0;
//
//            int nc = 0;
//            int rc = 0;
//            int fc = 0;
//
//            if (linea.contains("*<]:-DOo")){
//                nc++;
//                index = linea.indexOf("*<]:-DOo");
//                linea2 = linea.substring(index);
//                while (index != -1){
//                    linea2 = linea2.substring(index);
//                    if (linea2.contains("*<]:-DOo")){
//                        nc++;
//                        index = linea2.indexOf("*<]:-DOo") + 1;
//                    } else {
//                        break;
//                    }
//                }
//            }
//            index = 0;
//
//            if (linea.contains(">:o)")){
//                rc++;
//                index = linea.indexOf(">:o)");
//                linea2 = linea.substring(index);
//                while (index != -1){
//                    linea2 = linea2.substring(index);
//                    if (linea2.contains(">:o)")){
//                        rc++;
//                        index = linea2.indexOf(">:o)") + 1;
//                    } else {
//                        break;
//                    }
//                }
//            }
//            index = 0;
//
//            if (linea.contains("<]:-D")){
//                fc++;
//                index = linea.indexOf("<]:-D");
//                linea2 = linea.substring(index);
//                while (index != -1){
//                    linea2 = linea2.substring(index);
//                    if (linea2.contains("<]:-D")){
//                        fc++;
//                        index = linea2.indexOf("<]:-D") + 1;
//                    } else {
//                        break;
//                    }
//                }
//            }
//            index = 0;
//
//            fc=fc-nc;
//            System.out.print(nc > 0 ? "Pare Noel (" + nc + ") ":"");
//            System.out.print(rc > 0 ? "Ren (" + rc + ") ":"");
//            System.out.println(fc > 0 ? "Follet (" + fc + ") ":"");
//        }
    }
}
