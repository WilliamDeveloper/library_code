package br.com.utils;

import java.io.File;



public class _FileUtils {

    public static boolean doDirCreate(String pNomeDiretorio){
         return new File(pNomeDiretorio).mkdir();
    }

    public static boolean doDirRemove(String pNomeDiretorio){
        return  new File(pNomeDiretorio).delete();
    }



    public static void main(String[] args) {
        System.out.println("_FileUtils "+_FileUtils.doDirCreate("/"));
        System.out.println("_FileUtils "+_FileUtils.doDirCreate("/pimba333"));
        System.out.println("_FileUtils "+_FileUtils.doDirRemove("/pimba333"));
    }
}
